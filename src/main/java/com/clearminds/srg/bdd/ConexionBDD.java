package com.clearminds.srg.bdd;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.clearminds.srg.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String nombrePropiedad) {

		try {
			Properties properties = new Properties();
			properties.load(new FileReader("src/main/java/com/clearminds/srg/middleware/conexion.properties"));

			if (properties.getProperty(nombrePropiedad) == null) {
				return null;
			} else {
				return properties.getProperty(nombrePropiedad);
			}

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	public static Connection obtenerConexion() throws BDDException {
		String user = leerPropiedad("user");
		String password = leerPropiedad("password");
		String urlConexion = leerPropiedad("urlConexion");

		try {
			Connection conexion = DriverManager.getConnection(urlConexion, user, password);

			return conexion;

		} catch (Exception e) {
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}

	}

}
