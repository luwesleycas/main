package DAO;

import Model.User;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Factory.ConnectionFactory;

public class UserDAO {

    private final Connection connection;
    PreparedStatement stmt;
    ResultSet result;
    ArrayList<User> list = new ArrayList<>();

    long id;
    String name;
    String pass;
    String email;
    String cpf;
    String birth;
    boolean admin;

    public UserDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    /**
     * @param user
     */
    public void create(User user) {
        String query = "INSERT INTO users(name, pass, email, cpf) VALUES(?,?,?,?)";
        try {
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, User.getName());
                stmt.setString(2, User.getPass());
                stmt.setString(3, User.getEmail());
                stmt.setString(4, User.getCpf());
                stmt.setString(5, User.getBirth());
                stmt.execute();
                stmt.close();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList<User> read() {
        String query = "SELECT * FROM users";

        try {
            stmt = connection.prepareStatement(query);
            result = stmt.executeQuery();

            while (result.next()) {
                User objUser = new User();
                objUser.setId(result.getInt("id"));
                objUser.setName(result.getString("name"));
                objUser.setPass(result.getString("pass"));
                objUser.setEmail(result.getString("email"));
                objUser.setCpf(result.getString("cpf"));
                objUser.setBirth(result.getString("birth"));
                objUser.setAdmin(result.getBoolean("admin"));

                list.add(objUser);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UserDAO " + e);
        }
        return list;

    }

    public void update(User user) {
        String query = "UPDATE users SET name= ?,pass= ?,email= ?,cpf= ? WHERE id = ?";
        try {
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, User.getName());
                stmt.setString(2, User.getPass());
                stmt.setString(3, User.getEmail());
                stmt.setString(4, User.getCpf());
                stmt.setInt(5, User.getId());

                stmt.execute();
                stmt.close();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void delete(User user) {
        String query = "DELETE FROM users WHERE id = ?";
        try {
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setInt(1, User.getId());

                stmt.execute();
                stmt.close();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
