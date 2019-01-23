package com.qualiti.algoritmos.aula1;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero");
		int n2 = scan.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int n3 = scan.nextInt();
		
		// assumindo os tres numeros diferentes
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1);
		} else if(n2 > n1 && n2 > n3) {
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}
		
		scan.close();

	}

}
