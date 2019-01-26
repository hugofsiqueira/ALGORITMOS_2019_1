package com.qualiti.algoritmos.repeticao;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();

	}

}
