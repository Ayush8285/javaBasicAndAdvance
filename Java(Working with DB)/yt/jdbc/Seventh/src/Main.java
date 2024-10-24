
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students",
                    "akii", "Ayush@1221");

            //scroll and non-scroll types of result set
            //and concurrent is updatable and non-updatable

            String query = "Select * from students.table1";
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = statement.executeQuery(query);

//            rs.last();
//                rs.first();
//            rs.absolute(2);
            rs.next();


            int id = rs.getInt(1);
            String n = rs.getString(2);
            String c = rs.getString(3);

            System.out.println("id:" + id + "   name:" + n + "   city: " + c);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}