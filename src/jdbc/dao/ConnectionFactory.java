package jdbc.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**

 *

 * @author Klaus Boeing

 */

public class ConnectionFactory {


    public Connection getConnection() {

        try {

            return DriverManager.getConnection(

                    "jdbc:derby:C:/Users/FACULDADE/Desktop/Nova pasta/JDBC/Contatos", "user", "user");

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }

}
