import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception{

        //by using FileInputStream and Properties
        //in this both txt and properties extension applicable

        FileInputStream file = new FileInputStream("data.txt");
        Properties p = new Properties();
        p.load(file);
        Class.forName(p.getProperty("driver"));

        Connection conn = DriverManager.getConnection(p.getProperty("url"),
                p.getProperty("user"),p.getProperty("password"));

        if(conn != null){
            System.out.println("connect");

        }
        conn.close();
    }
}