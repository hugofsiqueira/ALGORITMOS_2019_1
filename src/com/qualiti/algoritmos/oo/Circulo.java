package com.qualiti.algoritmos.oo;

public class Circulo {
	
	private double raio;
	private static final double PI = 3.14;
	
	public double calcularArea() {
		return raio*raio*PI;
	}
	
	public double calcularComprimento() {
		return 2*PI*raio;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public static void main(String[] args) {
		Circulo circ = new Circulo();
		circ.setRaio(8);
		System.out.println("Area: "+ circ.calcularArea());
		System.out.println("Comprimento: "+ circ.calcularComprimento());
	}
	

}
