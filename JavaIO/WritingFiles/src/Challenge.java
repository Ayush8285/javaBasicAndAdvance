import student.Course;
import student.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {

    public static void main(String[] args) {

        String delimiter = ","+System.lineSeparator();
        Course jmc = new Course("JMC", "Java Masterclass");
        Course pymc = new Course("PYC", "Python Masterclass");
        String students = Stream
                .generate(() -> Student.getRandomStudent(jmc, pymc))
                .limit(10)
                .map(Student::toJSON)
                .collect(Collectors.joining(delimiter,"[","]"));

//        System.out.println(students);

        try{
            Files.writeString(Path.of("students.json"),students);
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

}
