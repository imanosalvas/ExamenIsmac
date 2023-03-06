package com.distribuida.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class PruebaConexionJDBC {

	public static void main(String[] args) {
		String jdbcURL="jdbc:sqlserver://localhost:1433;database=DBFacturas1;trustServerCertificate=True";
        String user="pruebas";
        String password="pruebas";

        try {

            System.out.println("Estableciendo conexión......" + jdbcURL);

        Connection connection = DriverManager.getConnection(jdbcURL,user,password);

            System.out.println("CONEXION EXITOSA");

        } catch (Exception e) {
            e.printStackTrace();
        }
		
}
}