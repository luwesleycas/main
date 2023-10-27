package DAO;

import Factory.ConnectionFactory;
import Model.OrderProduct;
import java.sql.*;

import javax.management.RuntimeErrorException;

public class OrderProductDAO {
    private final Connection connection;
    Long id;
    Long id_order;
    Long id_product;
    Double price;

    public OrderProductDAO(){
        this.connection = ConnectionFactory.getConnection();
    }
    public void crate(OrderProduct orderProduct){
        String query = "INSERT INTO order_products(id_order, id_product, price) VALUES(?,?,?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setLong(1, orderProduct.getId_order());
                stmt.setLong(2, orderProduct.getId_product());
                stmt.setDouble(3, orderProduct.getPrice());
            }
        } catch (SQLException u ) {
            throw new RuntimeException(u);
        }
    }
}
