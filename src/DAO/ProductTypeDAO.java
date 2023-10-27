package DAO;
import Factory.ConnectionFactory;
import Model.ProductType;
import java.sql.*;

public class ProductTypeDAO {
    public final Connection connection;
    Long id;
    String type;
    public ProductTypeDAO(){
        this.connection = ConnectionFactory.getConnection();        
    }

    public void create(ProductType productType){
        String query = "INSERT INTO product_types(type) VALUES(?)";
        try {
            try(PreparedStatement stme = connection.prepareStatement(query) ){
                stme.setString(1, productType.getType());
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);

        }
    }
}
