import java.sql.*;
public class establishConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/demo";
        String user = "root";
        String password = "12345678";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            if (con!=null){
                System.out.println("Connected to the Database");
                con.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
