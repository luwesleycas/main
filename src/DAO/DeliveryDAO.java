package DAO;
import Factory.ConnectionFactory;
import Model.Delivery;
import java.sql.*; 

public class DeliveryDAO {
    public final Connection connection;
    Long id;
    Long id_order;
    Long id_client;
    Long adress;

    public DeliveryDAO(){
        this.connection = ConnectionFactory.getConnection();
    }

    public void crate(Delivery delivery){
        String query = "INSERT INTO deliveries(id_order, id_client, adress) VALUES(?,?,?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setLong(1, delivery.getId_order());
                stmt.setLong(1, delivery.getId_client());
                stmt.setLong(1, delivery.getAdress());
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
