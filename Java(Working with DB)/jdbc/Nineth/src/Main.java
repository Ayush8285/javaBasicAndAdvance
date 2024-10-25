import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{

            //storing images to database

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
                    "MYSQL-USER" , "MYSQL-PW");


            PreparedStatement preparedStatement = conn.prepareStatement("insert into" +
                    " images values(?, ?, ?)");

            Scanner in = new Scanner(System.in);
            System.out.println("enter id, name, filename");
            int id = in.nextInt();
            String name = in.next();
            String file = in.next();

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2, name);
            FileInputStream f = new FileInputStream(file);
            preparedStatement.setBinaryStream(3, f,f.available());

            preparedStatement.executeUpdate();
            System.out.println("done....");


            in.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}