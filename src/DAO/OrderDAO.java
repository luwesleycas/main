package DAO;

import Factory.ConnectionFactory;
import Model.Order;
import java.sql.*; 

public class OrderDAO {
    private final Connection connection;
    Long id;
    Long id_user;
    Long id_client;
    Long id_status;
    String datetime_open;
    String datetime_close;
    Double value;

    private OrderDAO(){
        this.connection = ConnectionFactory.getConnection();
    }

    public void create(Order order){
        String query = "INSERT INTO orders(id_user, id_client, id_status, datetime_open, datetime_close, value) VALUES(?,?,?,?,?,?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setLong(1, order.getId_user());
                stmt.setLong(2, order.getId_client());
                stmt.setLong(3, order.getId_status());
                stmt.setString(4, order.getDatetime_open());
                stmt.setString(5, order.getDatetime_close());
                stmt.setDouble(1, order.getvalue());
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
