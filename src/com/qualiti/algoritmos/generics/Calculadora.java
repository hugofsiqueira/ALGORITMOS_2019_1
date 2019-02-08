package com.qualiti.algoritmos.generics;

public class Calculadora<T extends Number> {
	
	public double somar(T x, T y) {
		return x.doubleValue() + y.doubleValue();
	}
	
	public double subtrair(T x, T y) {
		return x.doubleValue() - y.doubleValue();
	}
	
	public double dividir(T x, T y) {
		return x.doubleValue() / y.doubleValue();
	}
	
	public double multiplicar(T x, T y) {
		return x.doubleValue() * y.doubleValue();
	}
	
	public double resto(T x, T y) {
		return x.doubleValue() % y.doubleValue();
	}
	
	public static void main(String[] args) {
		Calculadora<Integer> calc = new Calculadora<>();
		double resposta = calc.somar(3, 4);
		
		Calculadora<Float> calcFloat = new Calculadora<>();
		double resposta2 = calcFloat.somar(3.3f, 4.4f);
	}

}
