package com.qualiti.algoritmos.generics;

public class Calculadora {
	
	public  <T extends Number> double  somar(T x, T y) {
		return x.doubleValue() + y.doubleValue();
	}
	
	public <T extends Number> double subtrair(T x, T y) {
		return x.doubleValue() - y.doubleValue();
	}
	
	public  <T extends Number> double dividir(T x, T y) {
		return x.doubleValue() / y.doubleValue();
	}
	
	public  <T extends Number> double multiplicar(T x, T y) {
		return x.doubleValue() * y.doubleValue();
	}
	
	public  <T extends Number> double resto(T x, T y) {
		return x.doubleValue() % y.doubleValue();
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		double resposta = calc.somar(3, 4);
		System.out.println(resposta);
		
		Calculadora calcFloat = new Calculadora();
		double resposta2 = calcFloat.somar(3.3f, 4.4f);
		System.out.println(resposta2);
	}

}
