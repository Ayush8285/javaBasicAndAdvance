import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");


            String url = "jdbc:mysql://localhost:3306/students";
            String user = "akii";
            String password = "Ayush@1221";
            Connection conn = DriverManager.getConnection(url, user, password);

            //create a query
            String query = "insert into table1(tName, tCity) values(?, ?)";

            //get the preparedStatement
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name : ");
            String name = bufferedReader.readLine();

            System.out.println("Enter your city : ");
            String city = bufferedReader.readLine();


            //set the values to query

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, city);

            preparedStatement.executeUpdate();

            System.out.println("Inserted...");

            conn.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}