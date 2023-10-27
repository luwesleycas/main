package DAO;

import Factory.ConnectionFactory;
import Model.Cash;
import java.sql.*;

public class CashDAO {
    private final Connection connection;
    Long id;
    Long id_user;
    Long type;
    String date;
    Double value;

    public CashDAO(){
        this.connection = ConnectionFactory.getConnection();
    }

    public void create(Cash cash){
        String query = "INSTERT INTO cash(id_user, type, date, value) VALUES(?,?,?,?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setLong(1, cash.getId_user());
                stmt.setLong(2, cash.getType());
                stmt.setString(3, cash.getDate());
                stmt.setDouble(3, cash.getValue());
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
