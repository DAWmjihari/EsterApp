package database;

import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import wp.WpPassword;

/**
 *
 * @author mjihari
 */
public class User {

    private final ConnectionDB conn;

    public User() {
        conn = new ConnectionDB();
    }

    public boolean checkUserAdmin(String user, String password) {
        String sql_select = "SELECT user_pass FROM wp_users WHERE user_login LIKE \"" + user + "\"";
        String hash_password = "";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conn.connect().prepareStatement(sql_select);
            rs = ps.executeQuery();

            while (rs.next()) {
                hash_password = rs.getString(1);
            }
            if (hash_password.equals("")) {
                return false;
            } else {
                try {
                    return WpPassword.check(password, hash_password);
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error when listing customers : " + e.getMessage());
        } finally {
            conn.desconect();
        }

        return false;
    }
}
