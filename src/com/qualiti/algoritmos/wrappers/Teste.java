package com.qualiti.algoritmos.wrappers;

public class Teste {

	public static void main(String[] args) {
		
		Double d = 4.9; //in box
		
		double x = d; //out box
		
		String texto = "2,98";
		
		texto = texto.replace(",", ".");
		double numero = Double.parseDouble(texto);
		
		Integer j = Integer.parseInt("500");

	}

}
