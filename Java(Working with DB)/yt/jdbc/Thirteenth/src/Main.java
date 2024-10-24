import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //transaction example

        String withdrawQuery = "update accounts set balance = balance - ? where account_number = ?";

        String depositQuery = "update accounts set balance = balance + ? where account_number = ?";


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
                "akii", "Ayush@1221");

        connection.setAutoCommit(false);
        try {
            PreparedStatement withdrawStatement = connection.prepareStatement(withdrawQuery);
            PreparedStatement depositStatement = connection.prepareStatement(depositQuery);
            withdrawStatement.setDouble(1, 500.00);
            withdrawStatement.setString(2, "account123");
            depositStatement.setDouble(1, 500.00);
            depositStatement.setString(2, "account456");
            int rowsAffectedWithdraw = withdrawStatement.executeUpdate();
            int rowsAffectedDeposit = depositStatement.executeUpdate();
            if(rowsAffectedWithdraw > 0 && rowsAffectedDeposit > 0){
                connection.commit();
                System.out.println("transaction success");
                connection.setAutoCommit(true);
            }else{
                connection.rollback();
                System.out.println("Transaction fail");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }
}