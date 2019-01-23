package com.qualiti.algoritmos.aula1;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int x = scan.nextInt();
		
		if(x%2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}
		
		scan.close();
	}

}
