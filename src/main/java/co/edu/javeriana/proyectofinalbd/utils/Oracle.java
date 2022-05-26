package co.edu.javeriana.proyectofinalbd.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Oracle
{
    private static final String host = "orion.javeriana.edu.co";
    private static final String port = "1521";
    private static final String user = "is107400";
    private static final String pass = "6Qn8QhhQXi";
    private static final String database = "LAB";

    private final String parameters = "";
    private static Connection connection = null;


    public static boolean conectar()
    {
        boolean result = false;
        try
        {
            String path = "jdbc:oracle:thin:@" + Oracle.host + ":" + Oracle.port + "/" + Oracle.database;
            System.out.println(path);
            Oracle.connection = DriverManager.getConnection(path, Oracle.user, Oracle.pass);
            System.out.println("Se conecto");
            result = true;

        }
        catch (SQLException ex)
        {
            System.out.println("No se conecto");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            Oracle.connection=null;
            result = false;
        }
        catch(Exception ex)
        {
            System.out.println("No se conecto");
            System.out.println("Exception: " + ex.getMessage());
            Oracle.connection=null;
            result = false;
        }
        return result;
    }

    public void desconectar()
    {
        try
        {
            Oracle.connection.close();
            System.out.println("Se desconecto");
        }
        catch (SQLException ex)
        {
            System.out.println("No se desconecto");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        Oracle.connection = null;
    }

    public Connection getConnection()
    {
        return connection;
    }
}