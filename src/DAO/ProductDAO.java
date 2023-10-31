package DAO;
import Factory.ConnectionFactory;
import Model.Product;
import java.sql.*;

public class ProductDAO {
    public final Connection connection;
    Long id;
    String name;
    Long descript;
    Long id_type;
    Double price;
    Boolean availability;
    public ProductDAO(){
        this.connection = ConnectionFactory.getConnection();
    }
    public void crate(Product product){
        String query = "INSERT INTO products(name, descript, id_type, price, availability) VALUES(?,?,?,?,?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setString(1, product.getName());
                stmt.setLong(1, product.getDescript());
                stmt.setLong(1, product.getId_type());
                stmt.setDouble(1, product.getPrice());
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
