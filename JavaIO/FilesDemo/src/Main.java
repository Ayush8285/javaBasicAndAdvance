import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {


        Path path = Path.of("");
        System.out.println("cwd = " + path.toAbsolutePath());


        try (Stream<Path> paths = Files.list(path)) {
            paths
                    .map(Main::listDir)
                    .forEach(s -> System.out.println(s));
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("-".repeat(30));
        try (Stream<Path> paths = Files.walk(path,2)) {
            paths
//                    .filter(f -> Files.isRegularFile(f))
                    .filter(Files::isRegularFile)
                    .map(m -> Main.listDir(m))
//                    .map(Main::listDir)
                    .forEach(s -> System.out.println(s));
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("-".repeat(30));
        try (Stream<Path> paths = Files.find(path,Integer.MAX_VALUE,
                (p,attr) -> attr.isRegularFile() && attr.size() > 300
                )) {
            paths
                    .map(m -> Main.listDir(m))
                    .forEach(s -> System.out.println(s));
        }catch (IOException e){
            e.printStackTrace();
        }

        path = path.resolve(".idea");
        System.out.println("=============Directory stream=============");
        try(var dirs = Files.newDirectoryStream(path)){
            dirs.forEach(d -> System.out.println(Main.listDir(d)));
        }catch (IOException e){
            throw new RuntimeException();
        }

        System.out.println("=============Directory stream=============");
        try(var dirs = Files.newDirectoryStream(path,
                p -> p.getFileName().toString().endsWith(".xml")
        && Files.isRegularFile(p) && Files.size(p) > 1000)){
            dirs.forEach(d -> System.out.println(Main.listDir(d)));
        }catch (IOException e){
            throw new RuntimeException();

        }

    }


    private static String listDir(Path path){
       try {
           boolean isDir = Files.isDirectory(path);
           FileTime dateField = Files.getLastModifiedTime(path);
           LocalDateTime modDT = LocalDateTime.ofInstant(
                   dateField.toInstant(), ZoneId.systemDefault());
//           return "%s %-15s %s".formatted(dateField ,(isDir ? "<DIR>" : "") ,path);
           return "%tD %tT %-5s %12s %s".formatted(modDT,modDT,(isDir ? "<DIR>" : "") ,
                   (isDir ? "" : Files.size(path)),path);

       }catch (IOException e){
           System.out.println("Whoops! Something went wrong " + path);
           return path.toString();
       }
    }
}