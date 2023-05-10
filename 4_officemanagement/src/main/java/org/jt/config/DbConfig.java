package org.jt.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
    private DbConfig() {
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/officemanagement", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
