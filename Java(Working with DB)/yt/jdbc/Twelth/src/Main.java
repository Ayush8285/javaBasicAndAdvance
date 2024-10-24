
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


public class Main {
    public static void main(String[] args) throws Exception {

        //this program is not running and I don't understand why it is not running.

        //rowSet is an extended version of resultSet

//        5 types of rowset
//          jdbcrowset
//          cachedrowset
//          webrowset
//          filterrowset
//          joinrowset

//        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();


        RowSetFactory rowSetProvider =  RowSetProvider.newFactory();
        JdbcRowSet rowSet = rowSetProvider.createJdbcRowSet();
                                                                                                      ;

        Class.forName("com.mysql.cj.jdbc.Driver");
        rowSet.setUrl("jdbc:mysql://localhost:3306/students");
        rowSet.setUsername("akii");
        rowSet.setPassword("Ayush@1221");

//        rowSet.setCommand("insert into table1 values(2,'tim','delhi'");
        rowSet.setCommand("insert into table1 values(?,?,?)");
//        rowSet.setCommand("select * from table1");
        rowSet.setInt(1, 3);
        rowSet.setString(2, "tom");
        rowSet.setString(3, "Haryana");
//        while (rowSet.next()){
//            int id = rowSet.getInt(1);
//            String name = rowSet.getString(2);
//            String city = rowSet.getString(3);
//
//            System.out.println("---" + id + "----" + name + "----" + city);
//        }
        rowSet.execute();

        rowSet.close();


    }
}