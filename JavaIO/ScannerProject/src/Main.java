import javax.annotation.processing.FilerException;
import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
//        try (Scanner s = new Scanner(new File("file.txt"))) {
//            while (s.hasNextLine()){
//                System.out.println(s.nextLine());
//            }

//            System.out.println(s.delimiter());
//            s.useDelimiter("$");
//            s.tokens().forEach(System.out::println);

//            s.findAll("[A-Za-z]{10,}")
//                    .map(MatchResult::group)
//                    .distinct()
//                    .sorted()
//                    .forEach(System.out::println);

//        try (Scanner s = new Scanner(new File("fixedWidth.txt"))){
//        try (Scanner s = new Scanner(new BufferedReader(new FileReader("fixedWidth.txt")))) {
        try (Scanner s = new Scanner(new FileReader("fixedWidth.txt"))){
//        try (Scanner s = new Scanner(Path.of("fixedWidth.txt"))) {

            var results = s.findAll("(.{15})(.{3})(.{12})(.{8})(.{2}).*")
                    .map(m -> m.group(5).trim())
                    .distinct()
                    .sorted()
                    .toArray(String[]::new);

            System.out.println(Arrays.toString(results));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}