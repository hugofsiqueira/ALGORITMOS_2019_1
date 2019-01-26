package com.qualiti.algoritmos.array;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 12;
		idades[1] = 28;
		idades[2] = 76;
		idades[3] = 35;
		idades[4] = 25;
		
		// Arrays.sort(idades); ordernar arrays
		
		for(int i = idades.length - 1; i >= 0; i--) {
			System.out.println(idades[i]);
		}

	}

}
