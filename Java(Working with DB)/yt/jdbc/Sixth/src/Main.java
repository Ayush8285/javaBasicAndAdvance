import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try{
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName("127.0.0.1");
            dataSource.setPort(3306);
            dataSource.setDatabaseName("students");

            Connection connection = dataSource.getConnection("akii", "Ayush@1221");

//            if(connection.isClosed()){
//                System.out.println("not ");
//            }else {
//                System.out.println("connected");
//            }

            String query = "select * from table1";

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt("tId");
                String name = resultSet.getString(2);
                String city = resultSet.getString(3);

                System.out.println("id: " + id + ", name: " + name + ", city: " + city);
            }

            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}