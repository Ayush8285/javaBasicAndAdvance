import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class Main2 {
    public static void main(String[] args) throws Exception {

        //by using Resource Bundle
        //in this only properties extension applicable

        ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

        Class.forName(resourceBundle.getString("driver"));

        Connection connection = DriverManager.getConnection(resourceBundle.getString("url"),
                resourceBundle.getString("user"),resourceBundle.getString("password"));

        System.out.println(resourceBundle.getBaseBundleName());
        System.out.println(resourceBundle.getKeys());
        System.out.println(resourceBundle.keySet());

        if(connection != null){
            System.out.println("done...");
        }

        connection.close();




    }
}
