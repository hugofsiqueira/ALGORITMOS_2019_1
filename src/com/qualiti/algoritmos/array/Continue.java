package com.qualiti.algoritmos.array;

public class Continue {

	public static void main(String[] args) {
		
		int[] valores = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] % 2 == 0) {
				continue;
			}
			System.out.println(valores[i]);
		}
		
		for(int numero : valores) { //for each
			System.out.println(numero);
		}

	}

}
