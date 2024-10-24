import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
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

            //insert image

            String query = "insert into images(pictures) values(?)";

            PreparedStatement preparedStatement = conn.prepareStatement(query);

//            FileInputStream file = new FileInputStream("pic1.jpg");

            //for short binary images use blob in db
//            preparedStatement.setBinaryStream(1, file, file.available());
//            preparedStatement.setBlob(1, file);



            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);

            File file = jfc.getSelectedFile();
            FileInputStream f = new FileInputStream(file);

            //for long binary images use longblob in db
                preparedStatement.setBinaryStream(1, f, f.available());

            preparedStatement.executeUpdate();

            System.out.println("inserted ..");
            JOptionPane.showMessageDialog(null, "success");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}