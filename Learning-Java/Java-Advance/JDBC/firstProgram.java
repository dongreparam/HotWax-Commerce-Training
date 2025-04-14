import java.sql.DriverManager;
import java.sql.*;

public class firstProgram {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "12345678";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,user,pass);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
