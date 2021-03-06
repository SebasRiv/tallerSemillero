package com.clearminds.srg.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.srg.dtos.Estudiante;
import com.clearminds.srg.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("insertando estudiante:" + estudiante);
		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();

			String sql = "insert into estudiantes(nombre, apellido) values('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido() + "')";

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("actualizando estudiante: " + estudiante);
		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();

			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "' where id=" + estudiante.getId();

			System.out.println("Script: " + sql);
			stmt.executeUpdate(sql);
			cerrarConexion();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}

	}
}
