package com.clearminds.srg.servicios;

import com.clearminds.srg.dtos.Estudiante;
import com.clearminds.srg.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("insertando estudiante:" + estudiante);
		cerrarConexion();
	}
	
}
