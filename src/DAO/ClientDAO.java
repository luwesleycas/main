package DAO;

import Factory.ConnectionFactory;
import Model.Client;
import java.sql.*;

public class ClientDAO {
    private final Connection connection;
    String name;
    String birth;
    String cpf;
    String email;
    String address;
    String zipcode;
    String number;

    public ClientDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void create(Client client){
        String query = "INSERT INTO clients(name, birth, cpf, email, address, zipcode, number) VALUES(?,?,?,?,?,?,?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setString(1, client.getName());
                stmt.setString(2, client.getBirth());
                stmt.setString(3, client.getCpf());
                stmt.setString(4, client.getEmail());
                stmt.setString(5, client.getAddress());
                stmt.setString(6, client.getZipcode());
                stmt.setString(7, client.getNumber());
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException();
        }
    }
}
