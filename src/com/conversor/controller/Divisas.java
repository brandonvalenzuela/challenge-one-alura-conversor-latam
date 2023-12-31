package com.conversor.controller;

public enum Divisas {

	MEXUSA("Peso a Dolar", 0.060, "Dolares"), USAMEX("Dolar a Peso", 16.79, "Pesos"),
	MEXEURO("Peso a Euro", 0.053, "Euros"), EUROMEX("Euro a Peso", 18.80, "Pesos"),
	MEXLIBRA("Peso a Libra", 0.046, "Libras"), LIBRAMEX("Libra a Peso", 21.62, "Pesos"),
	MEXYEN("Peso a Yen", 0.12, "Yenes"), YENMEX("Yen a Peso", 8.32, "Pesos"),
	MEXWON("Peso a Won Coreano", 0.013, "Wons"), WONMEX("Won Coreano a Peso", 75.74, "Pesos");

	double pesoADivisa;
	String nombre, tipoDivisa;

	private Divisas(String nombre, double pesoADivisa, String tipoDivisa) {
		this.nombre = nombre;
		this.pesoADivisa = pesoADivisa;
		this.tipoDivisa = tipoDivisa;
	}
	
	public double getPesoADivisa() {
		return pesoADivisa;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTipoDivisa() {
		return tipoDivisa;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
