package com.roger.conceptos4.bases_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class ConectarBaseDatos {
    private static Connection conexionBaseDatos;
    private ConectarBaseDatos()  {
    }

    public static Connection getConexionBaseDatos() throws SQLException {
        if(conexionBaseDatos == null) {
            //conexionBaseDatos = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");

            conexionBaseDatos = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");

            
        }
        return conexionBaseDatos;
    }


}
