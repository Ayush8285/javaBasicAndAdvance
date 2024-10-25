import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{


        //first way to store date in database

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
                "MYSQL-USER", "MYSQL-PW");


        Scanner in = new Scanner(System.in);
        System.out.println("enter id, name and date(dd-MM-yyyy)");
        int id = in.nextInt();
        String name = in.next();
        String date = in.next();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        java.util.Date javaDate = simpleDateFormat.parse(date);
        java.sql.Date sqlDate = new java.sql.Date(javaDate.getTime());

        PreparedStatement preparedStatement = connection.prepareStatement("insert into " +
                "employee values(?, ?, ?)");

        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setDate(3, sqlDate);

        preparedStatement.executeUpdate();
        System.out.println("done.....");

        connection.close();

    }
}