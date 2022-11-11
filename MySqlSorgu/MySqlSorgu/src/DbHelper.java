import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String userName = "root";
    static String passWord = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3306/classicmodels";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,passWord);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error : "+exception.getMessage());
        System.out.println("Error code : "+exception.getErrorCode());
    }

}
