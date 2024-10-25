import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/students";
            String user = "MYSQL-USER";
            String password = "MYSQL-PW";

            Connection connection = DriverManager.getConnection(url, user, password);

            //update the values
            String query = "update table1 set tName=? , tCity=? where tId=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name :");
            String name = br.readLine();

            System.out.println("Enter new city :");
            String city = br.readLine();


            System.out.println("Enter the student id :");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, city);
            preparedStatement.setInt(3, id);

            preparedStatement.executeUpdate();

            System.out.println("Done.......");
            connection.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}