package com.clearminds.srg.bdd.test;

import com.clearminds.srg.dtos.Estudiante;
import com.clearminds.srg.excepciones.BDDException;
import com.clearminds.srg.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();

		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Marco", "Chavez"));
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
