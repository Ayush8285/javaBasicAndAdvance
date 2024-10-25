import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;

public class Main2 {

    public static void main(String[] args) throws Exception{



        // accessing image from database to desktop

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
                "akii" , "Ayush@1221");

        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from images");

        while(resultSet.next()){

            Blob b = resultSet.getBlob(3);
            FileOutputStream f = new
                    FileOutputStream("C:/Desktop/" +
                    resultSet.getString(2)  + ".jpg");

            f.write(b.getBytes(1, (int)b.length()));
            f.close();
        }

        conn.close();

    }
}
