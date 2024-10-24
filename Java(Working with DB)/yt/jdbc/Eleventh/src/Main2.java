import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {

        //second way to store date in database      // not correct right now due to to_date function in sql

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
                "akii", "Ayush@1221");

        Statement statement = connection.createStatement();
        Scanner in = new Scanner(System.in);
        System.out.println("enter id, name , date");
        int id = in.nextInt();
        String name = in.next();
        String date = in.next();

        String q = "insert into employee values("+id+", '"+name+"',to_date('"+date+"','dd-mon-yyyy'))";

        statement.executeUpdate(q);
        System.out.println("done...");

        connection.close();

    }
}
