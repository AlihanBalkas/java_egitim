import java.sql.*;
import java.util.ArrayList;

public class Main {

    //static String userName = "root";
    //static String password = "12345";
    //static String dbUrl = "jdbc:mysql://localhost:3306/classicmodels";

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet = null; // sorgunun sonucu

        try {
            connection = helper.getConnection();
            String sql = "insert into customers (city,customerName) values (?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Alihan");
            statement.setString(2,"Turkey");

            statement.executeUpdate();
            System.out.println("Kayıt Eklendi");

        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }


    }

    public static void selectDemo() throws SQLException{

        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null; // sorgunun sonucu

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from customers");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("customerName"),
                        resultSet.getString("contactLastName"),
                        resultSet.getString("contactFirstName")));
            }


            System.out.println(countries.size());

        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }


    }
}