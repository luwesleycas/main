package DAO;

import Factory.ConnectionFactory;
import Model.CashLaunch;
import java.sql.*;

public class CashLaunchDAO {
    private final Connection connection;
    long id;
    long id_cash;
    long id_payment_form;
    long id_order;
    double value;
    enum type {
        RECEITA, DESPESA, ESTORNO
    }

    public CashLaunchDAO(){
        this.connection = ConnectionFactory.getConnection();
    }

    public void crate(CashLaunch cashLaunch){
        String query = "INSERT INTO cash_launchs(id_cash, id_payment_form, id_order, value) VALUES(?,?,?,?)";
        try {
            try(PreparedStatement stmt = connection.prepareStatement(query)){
                stmt.setLong(1, cashLaunch.getId_cash());
                stmt.setLong(2, cashLaunch.getId_payment_form());
                stmt.setLong(3, cashLaunch.getId_order());
                stmt.setDouble(4, cashLaunch.getValue());
                stmt.execute();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        
    }
}
