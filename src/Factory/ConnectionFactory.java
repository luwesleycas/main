// situa em qual package ou "pacote" est� a classe 
package Factory;

// faz as importa�?es de classes necess�rias para o funcionamento do programa 
import java.sql.Connection;
// conex?o SQL para Java 
import java.sql.DriverManager;
// driver de conex?o SQL para Java 
import java.sql.SQLException;
// classe para tratamento de exce�?es 

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactory {
    /* configura par�metros de conex?o */
    private static final String URL = "jdbc:mysql://localhost:8889/pointERP";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        try {
            /* Obt�m o driver de conex?o com o banco de dados */
            Class.forName(DRIVER);
            /* TENTA CONECTAR */
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conex?o com o Banco de Dados: " + e);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conex?o com o Banco de Dados: " + e);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conex?o com o Banco de Dados: " + e);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conex?o com o Banco de Dados: " + e);
        }
    }
}
