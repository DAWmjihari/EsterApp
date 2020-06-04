package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mjihari
 */
public class Service {

    private final String sql_select = "SELECT c.name, s.title, SEC_TO_TIME(s.duration), s.price FROM wp_bookly_services s LEFT JOIN wp_bookly_categories c ON s.category_id = c.id";
    private PreparedStatement ps;
    private DefaultTableModel dt;
    private ResultSet rs;
    private final ConnectionDB conn;

    public Service() {
        conn = new ConnectionDB();
    }

    private DefaultTableModel setHeaderTable() {
        dt = new DefaultTableModel();
        dt.addColumn("Categoria");
        dt.addColumn("Nom");
        dt.addColumn("Duració");
        dt.addColumn("Cost");

        return dt;
    }

    public DefaultTableModel getServices() {
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
            throw new RuntimeException("Error when listing services : " + e.getMessage());
        } finally {
            ps = null;
            rs = null;
            conn.desconect();
        }
        return dt;
    }
}
