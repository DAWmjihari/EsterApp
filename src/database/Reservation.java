package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mjihari
 */
public class Reservation {

    private String sql_select = "SELECT DATE_FORMAT(a.start_date, '%d/%m/%Y') date, DATE_FORMAT(a.start_date, '%H:%i') hour, c.full_name,s.title FROM wp_bookly_customer_appointments ca LEFT JOIN wp_bookly_customers c ON ca.id = c.id LEFT JOIN wp_bookly_appointments a ON ca.appointment_id = a.id LEFT JOIN wp_bookly_services s ON s.id = a.service_id ";
    private PreparedStatement ps;
    private DefaultTableModel dt;
    private ResultSet rs;
    private final ConnectionDB conn;

    public Reservation() {
        conn = new ConnectionDB();
    }

    private DefaultTableModel setHeaderTable() {
        dt = new DefaultTableModel();
        dt.addColumn("Data");
        dt.addColumn("Hora");
        dt.addColumn("Client");
        dt.addColumn("Servei");
        return dt;
    }

    private void fetchResult(String sql_select) {
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
            throw new RuntimeException("Error when listing future reservation : " + e.getMessage());
        } finally {
            ps = null;
            rs = null;
            conn.desconect();
        }
    }

    public DefaultTableModel getFutureReservations() {
        sql_select += "WHERE a.start_date >= CURRENT_DATE";
        fetchResult(sql_select);
        return dt;
    }

    public DefaultTableModel getPastAprovedReservations() {
        sql_select += "WHERE a.start_date < CURRENT_DATE AND ca.status = \"approved\"";
        fetchResult(sql_select);
        return dt;
    }

    public DefaultTableModel getPastCancelledReservations() {
        sql_select += "WHERE a.start_date < CURRENT_DATE AND ca.status = \"cancelled\"";
        fetchResult(sql_select);
        return dt;
    }

    public DefaultTableModel getReservationsFromSearch(String full_name, String name_service, String date_rsv, String typeService) {
        sql_select += "WHERE c.full_name LIKE \"" + full_name + "%\" and s.title LIKE \"" + name_service + "%\" and a.start_date LIKE \"" + date_rsv + "%\" and ca.status LIKE \"" + typeService + "%\"";
        fetchResult(sql_select);
        return dt;
    }
}
