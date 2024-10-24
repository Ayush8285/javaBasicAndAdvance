import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students",
                    "akii", "Ayush@1221");

            Statement statement = conn.createStatement();

            //databaseMetadata  //meta data means -- data about data
            // or collect background details about tables ,Database

            DatabaseMetaData databaseMetaData = conn.getMetaData();

            System.out.println(databaseMetaData.getUserName());
            System.out.println(databaseMetaData.getStringFunctions());
            System.out.println(databaseMetaData.getNumericFunctions());
            System.out.println(databaseMetaData.getSystemFunctions());
            System.out.println(databaseMetaData.getMaxStatementLength());
            System.out.println(databaseMetaData.supportsStoredProcedures());
            System.out.println(databaseMetaData.getDriverName());
            System.out.println(databaseMetaData.getDriverVersion());
            System.out.println(databaseMetaData.getDatabaseProductName());
            System.out.println(databaseMetaData.getMaxIndexLength());
            System.out.println(databaseMetaData.getTables(null,null,null,null));


            System.out.println("-".repeat(100));

            //ResultSetMetaData
            String query = "select * from table1";
            ResultSet rs = statement.executeQuery(query);

            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int column = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= column; i++) {
                System.out.println(resultSetMetaData.getColumnName(i));
                System.out.println(resultSetMetaData.getColumnTypeName(i));
                System.out.println(resultSetMetaData.getPrecision(i));
                System.out.println(resultSetMetaData.getScale(i));
                System.out.println("-".repeat(20));

            }



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}