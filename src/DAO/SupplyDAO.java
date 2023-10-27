package DAO;

import Factory.ConnectionFactory;
import Model.Supply;
import java.sql.*;
import java.sql.PreparedStatement;

public class SupplyDAO {
    private final Connection connection;
    Long id;
    String name;
    Long descript;
    Enum measure;

    public SupplyDAO(){
        this.connection = ConnectionFactory.getConnection();
    }

    public void create(Supply supply) {
        String query = "INSERT INTO supplies(name, descript, measure) VALUES(?,?,?)";
        try {
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, supply.getName());
                stmt.setLong(2, supply.getDescript());
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
