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
            try(PreparedStatement stmt = connection.prepareStatement(query) ){
                stmt.setString(1, productType.getType());
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);

        }
    }
}
