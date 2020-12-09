package com.clearminds.srg.excepciones;

public class BDDException extends Exception{
	public BDDException() {
		super("No se pudo conectar a la base de datos");
	}
}
