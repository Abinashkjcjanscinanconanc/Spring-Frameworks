package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
    private DbConfig() {
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/officemanagement", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
