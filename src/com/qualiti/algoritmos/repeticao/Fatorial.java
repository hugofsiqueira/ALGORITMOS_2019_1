package com.qualiti.algoritmos.repeticao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int num = scan.nextInt();
		
		double fat = 1;
		
		if(num == 0 || num == 1) {
			System.out.println(fat);
		}else {
			
			for(int i = num; i > 1; i--) {
				fat = fat*i;
			}
			
			System.out.printf("O fatorial de %d é %.2f", num, fat);
			
		}

		
		
		scan.close();

	}

}
