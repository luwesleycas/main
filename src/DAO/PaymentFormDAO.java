package DAO;
import Factory.ConnectionFactory;
import Model.PaymentForm;
import Model.ProductType;
import java.sql.*;

public class PaymentFormDAO {
    public final Connection connection;
    Long id;
    String method;
    public PaymentFormDAO(){
        this.connection = ConnectionFactory.getConnection();        
    }

    public void create(PaymentForm paymentForm){
        String query = "INSERT INTO payment_forms(type) VALUES(?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query) ){
                stmt.setString(1, paymentForm.getMethod());
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);

        }
    }
}
