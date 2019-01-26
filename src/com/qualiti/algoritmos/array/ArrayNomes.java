package com.qualiti.algoritmos.array;

import java.util.Scanner;

public class ArrayNomes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] nomes = new String[5];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Digite um nome");
			nomes[i] = scan.next();
		}
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		scan.close();
	}

}
