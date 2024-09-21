import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        useFile("testfile.txt");
        usePath("pathfile.txt");

    }


    public static void useFile(String fileName) {

        File file = new File(fileName);
        boolean fileExists = file.exists();

        System.out.printf("File '%s' %s%n", fileName,
                fileExists ? "exists." : "does not exists.");

        if (fileExists) {
            System.out.println("Deleting File : " + fileName);
            fileExists = !file.delete();
        }

        if (!fileExists) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
            System.out.println("Created File: " + fileName);
            if (file.canWrite()) {
                System.out.println("Would write to file here");
            }
        }
    }


    public static void usePath(String fileName) {


        Path path = Path.of(fileName);
        boolean fileExists = Files.exists(path);

        System.out.printf("File '%s' %s%n", fileName,
                fileExists ? "exists." : "does not exists.");

        if (fileExists) {
            System.out.println("Deleting File : " + fileName);
            try {
                Files.delete(path);
                fileExists = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!fileExists) {
            try {
                Files.createFile(path);
                System.out.println("Created File: " + fileName);
                if (Files.isWritable(path)) {
                    Files.writeString(path, """
                            Here is some data,
                            For my file,
                            just to prove,
                            Using the Files class and path are better!
                            """);
                }
                System.out.println("And i can read too");
                System.out.println("_".repeat(40));
                Files.readAllLines(path).forEach(System.out::println);
//                System.out.println(Files.readAllLines(path));
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
        }
    }
}