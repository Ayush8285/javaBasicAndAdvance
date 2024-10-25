import java.sql.Connection;
import java.sql.DriverManager;


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

            if(conn.isClosed()){
                System.out.println("Connection is closed");
            }else{
                System.out.println("Connection is created...");
            }


            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}