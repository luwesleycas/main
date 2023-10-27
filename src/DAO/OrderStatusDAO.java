package DAO;
import Factory.ConnectionFactory;
import Model.OrderStatus;
import java.sql.*;
import java.sql.PreparedStatement;

public class OrderStatusDAO {
    public final Connection connection;
    Long id;
    String status;
    public OrderStatusDAO(){
        this.connection = ConnectionFactory.getConnection();        
    }

    public void create(OrderStatus orderStatus){
        String query = "INSERT INTO payment_forms(type) VALUES(?)";
        try {
            try(PreparedStatement stme = connection.prepareStatement(query) ){
                stme.setString(1, orderStatus.getStatus());
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);

        }
    }
}
