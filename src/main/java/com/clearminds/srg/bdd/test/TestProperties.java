package com.clearminds.srg.bdd.test;

import com.clearminds.srg.bdd.ConexionBDD;

public class TestProperties {

	public static void main(String[] args) {
		String valor = ConexionBDD.leerPropiedad("propiedad1");
		System.out.println(valor);
		valor = ConexionBDD.leerPropiedad("xx");
		System.out.println(valor);

	}

}
