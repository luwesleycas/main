package DAO;
import Model.User;
import java.sql.*;

import Factory.ConnectionFactory;

public class UserDAO {
    private final Connection connection;
    long id;
    String name;
    String pass;
    String email;
    String cpf;
    String birth;
    boolean admin;
    public UserDAO(){
        this.connection =  ConnectionFactory.getConnection();
    }

    /**
     * @param user
     */
    public void create(User user){
        String query = "INSERT INTO users(name, pass, email, cpf, birth, admin) VALUES(?,?,?,?,?,?,?,)";
        try{
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setString(1, User.getName());
                stmt.setString(2, User.getPass());
                stmt.setString(3, User.getEmail());
                stmt.setString(4, User.getCpf());
                stmt.setString(5, User.getBirth());
                stmt.execute();
            }
        }
        catch (SQLException u){
            throw new RuntimeException(u);
        }
    }
}
