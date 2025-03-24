import java.sql.*;

public class createTableJDBC {
    public static void main(String[] args) {

        // Database URL (modify it based on your DBMS)
        String url = "jdbc:mysql://localhost:3306/demo"; // Change to your database
        String user = "root"; // Your DB username
        String password = "12345678"; // Your DB password

        // SQL statement to create a table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Users ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(100) UNIQUE NOT NULL, "
                + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                + ")";

        // Try-with-resources to ensure the connection closes automatically
        try
        {

            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();


            // Execute the create table query
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'Users' created successfully.");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
