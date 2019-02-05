package com.qualiti.algoritmos.abstrata;

public class Losango extends FiguraGeometrica {
	
	private double dMenor;
	private double dMaior;
	
	public double calcularArea() {
		return dMenor*dMaior/2;
	}
	
	public double getdMenor() {
		return dMenor;
	}
	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}
	public double getdMaior() {
		return dMaior;
	}
	public void setdMaior(double dMaior) {
		this.dMaior = dMaior;
	}
	
	

}
