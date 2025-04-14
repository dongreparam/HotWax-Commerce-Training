import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertRows {
    public static void main(String[] args) {

        String db_name = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "12345678";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(db_name,user,pass);

            PreparedStatement ps = connection.prepareStatement
                    ("INSERT INTO Users (name, email) VALUES (?,?)");
            ps.setString(1,"Swati");
            ps.setString(2,"sawti.dongre@gmail.com");

            int a = ps.executeUpdate();
            System.out.println(a);


        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
