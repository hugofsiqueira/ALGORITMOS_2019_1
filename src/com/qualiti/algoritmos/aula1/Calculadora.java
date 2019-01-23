package com.qualiti.algoritmos.aula1;

import java.util.Scanner;

public class Calculadora {
	
	/**
	 * Fazer um programa que leia do usuario 2 numeros decimais e o um numero
	 * inteiro representando a operação que ele deseja executar.
	 * 
	 * 1 - Somar
	 * 2 - Subtrair
	 * 3 - Multiplicar
	 * 4 - Dividir
	 * 5 - Resto
	 * 
	 * O programa deve imprimir o resultado da operação selecionada aos numeros
	 * digitados.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite o segundo numero");
		double n2 = scan.nextDouble();
		
		System.out.println("Digite a operação");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - Resto");
		
		int op = scan.nextInt();
		
		switch(op) {
		case 1:
			System.out.println(n1 + n2);
			break;
			
		case 2:
			System.out.println(n1-n2);
			break;
			
		case 3:
			System.out.println(n1*n2);
			break;
			
		case 4:
			System.out.println(n1/n2);
			break;
			
		case 5:
			System.out.println(n1%n2);
			break;
			
		default:
			System.out.println("Operação inválida");
				
		}
		
		scan.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
