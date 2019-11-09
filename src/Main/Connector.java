package Main;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sajeeb
 */
public class Connector {

    public static void main(String[] args) {
        ConnectDb();
    }

    public static Connection ConnectDb() {
        Connection connection = null;
        try {

            Class.forName("java.sql.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/baymax","root","sanchita");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection failed !!!!");
        }
        return connection;
    }
}
