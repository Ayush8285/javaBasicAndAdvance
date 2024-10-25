import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            //create a connection
            String url = "jdbc:mysql://localhost:3306/students";
            String user = "MYSQL-USER";
            String password = "MYSQL-PW";
            Connection conn = DriverManager.getConnection(url, user, password);


            //Create a Query

            String query = "create table table1(tId int(20) primary key auto_increment," +
                    "tName varchar(200) not null, tCity varchar(400))";

            //create a statement

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("table created in database");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}