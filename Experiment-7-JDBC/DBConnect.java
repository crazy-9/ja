import java.sql.*;

public class DBConnect {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "root"; // Change to your local MySQL password.

        String query = "SELECT roll, name, branch FROM student";

        try {
            // Explicit driver loading is retained for this lab example.
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query)
            ) {
                System.out.println("Connection established successfully.");
                System.out.println("Roll\tName\tBranch");

                while (rs.next()) {
                    System.out.println(
                        rs.getInt("roll") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("branch")
                    );
                }

                System.out.println("Connection closed.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found. Check the Connector/J classpath.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
