import java.sql.*;
public class ClientDAO {

    private Connection conn;

    public ClientDAO(){
        String url = "jdbc:mysql://localhost:3306/clients_db";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addClient(Clients client){
        String sql = "INSERT INTO clients (name, phone, gmail) VALUES (?, ?, ?)";

        try {
            PreparedStatement statement2 = conn.prepareStatement(sql);
            statement2.setString(1, client.getName());
            statement2.setInt(2, client.getPhone());
            statement2.setString(3, client.getGmail());
            statement2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
