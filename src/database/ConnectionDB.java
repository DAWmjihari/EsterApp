package database;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author mjihari
 */
public class ConnectionDB {

    private Connection conn;
    public final String nameFileConnectionDB = "connection.properties";
    public final Properties fileConnection;

    public ConnectionDB() {
        if (nameFileConnectionDB.length() == 0) {
            throw new RuntimeException("To make a connection, you need the name of the file where the connection settings will be taken.");
        }

        fileConnection = new Properties();

        try {
            fileConnection.load(new FileReader(nameFileConnectionDB));
        } catch (IOException ex) {
            throw new RuntimeException("Problems loading configuration file: " + ex.getMessage());
        }

        // DB Params
        String db_driver = fileConnection.getProperty("db_driver");
        String db_user = fileConnection.getProperty("db_user");
        String db_pass = fileConnection.getProperty("db_pass");
        String db_url = fileConnection.getProperty("db_url");

        if (db_driver == null || db_user == null || db_pass == null && db_url == null) {
            throw new RuntimeException("Some of the connection properties in the database are missing : db_driver, db_user, db_pass,db_url");
        }
    }

    public Connection connect() {
        try {
            Class.forName(fileConnection.getProperty("db_driver"));
            conn = DriverManager.getConnection(fileConnection.getProperty("db_url"), fileConnection.getProperty("db_user"), fileConnection.getProperty("db_pass"));
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Connection failed: " + ex);
        }
        return conn;
    }

    public void desconect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Connection could not be closed: " + ex);
        }
    }
}
