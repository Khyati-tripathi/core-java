import java.sql.*;
import java.util.Arrays;

public class task1 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        final String url = "jdbc:mysql://localhost:3307/myorg";
        final String username = "root";
        final String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
                Statement st = connection.createStatement();) {
            String addColQuery = "ALTER TABLE WORKER ADD COLUMN email VARCHAR(255)";
            int res = st.executeUpdate(addColQuery);
            System.out.println(res);
            ResultSet result = st.executeQuery("SELECT * FROM WORKER");
            while (result.next()) {
                int id = result.getInt("WORKER_ID");
                String e = result.getString("FIRST_NAME").toLowerCase().substring(0, 1) +
                        "." + result.getString("LAST_NAME").toLowerCase() + "@myorg.com ";
                String sql = "UPDATE worker SET email= '" + e + "'WHERE worker_id=" + id;
                st.addBatch(sql);
            }
            st.executeBatch();

            String changeExt = "UPDATE WORKER SET email= REPLACE(email,'.com','.in')";
            int res1 = st.executeUpdate(changeExt);
            System.out.println(res1);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
