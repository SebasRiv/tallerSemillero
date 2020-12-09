package com.clearminds.srg.bdd;

import java.io.FileReader;
import java.util.Properties;

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

}
