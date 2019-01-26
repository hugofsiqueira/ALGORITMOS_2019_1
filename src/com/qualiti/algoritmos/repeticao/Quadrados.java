package com.qualiti.algoritmos.repeticao;

import java.util.Scanner;

public class Quadrados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int num = scan.nextInt();
		
		for(int linha = 1; linha <= num; linha++) {
			
			for(int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		scan.close();
		
	}

}
