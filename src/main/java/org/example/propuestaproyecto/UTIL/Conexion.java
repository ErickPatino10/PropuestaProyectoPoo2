package org.example.propuestaproyecto.UTIL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/empresa_poo";
    private static final String USER = "postgres"; // Cambia por tu usuario de PostgreSQL
    private static final String PASSWORD = "tu_password"; // Cambia por tu contraseña

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a PostgreSQL.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}
