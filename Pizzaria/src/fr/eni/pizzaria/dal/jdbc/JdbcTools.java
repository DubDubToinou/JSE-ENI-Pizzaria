package fr.eni.pizzaria.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.eni.pizzaria.dal.Settings;

public class JdbcTools {

    private static Connection con;

    public static Connection getConnection() throws SQLException {
        if(con == null) {
            con = DriverManager.getConnection(Settings.getProperty("url"),  Settings.getProperty("user"), Settings.getProperty("password"));
        }
        return con;
    }

    public static void closeConnection() throws  SQLException  {
        if(con != null)  {
            con.close();
            con = null;
        }
    }

}