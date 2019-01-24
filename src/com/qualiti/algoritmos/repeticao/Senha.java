package com.qualiti.algoritmos.repeticao;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int senha = 1234;
		int senhaDigitada = 0;
		
		do {
			System.out.println("Digite a senha");
			senhaDigitada = scan.nextInt();
			
			if(senha != senhaDigitada) {
				System.out.println("Senha invalida");
			}else {
				System.out.println("Bem-vindo ao sistema");
			}
			
		}while(senha != senhaDigitada);
		
		scan.close();
		

	}

}
