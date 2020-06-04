package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mjihari
 */
public class Client {

    private final String sql_select = "SELECT first_name,last_name,phone,email FROM wp_bookly_customers";
    private PreparedStatement ps;
    private DefaultTableModel dt;
    private ResultSet rs;
    private final ConnectionDB conn;

    public Client() {
        conn = new ConnectionDB();
    }

    private DefaultTableModel setHeaderTable() {
        dt = new DefaultTableModel();
        dt.addColumn("Nom");
        dt.addColumn("Cognom");
        dt.addColumn("Telèfon");
        dt.addColumn("Correu electrònic");

        return dt;
    }

    public DefaultTableModel getClients() {
        try {
            setHeaderTable();
            ps = conn.connect().prepareStatement(sql_select);
            rs = ps.executeQuery();

            Object[] row = new Object[4];

            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                dt.addRow(row);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error when listing customers : " + e.getMessage());
        } finally {
            ps = null;
            rs = null;
            conn.desconect();
        }
        return dt;
    }

}
