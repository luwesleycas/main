package DAO;

import Factory.ConnectionFactory;
import Model.Supply;
import java.sql.*;

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
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
