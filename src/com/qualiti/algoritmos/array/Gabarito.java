package com.qualiti.algoritmos.array;

import java.util.Scanner;

public class Gabarito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] gabarito = new int[10];
		int[] resposta = new int[10];
		
		for(int i = 0; i < gabarito.length; i++) {
			System.out.println("Digite o gabarito da questao " + (i +1));
			gabarito[i] = scan.nextInt();
		}
		
		for(int i = 0; i < resposta.length; i++) {
			System.out.println("Digite a resposta da questao " + (i +1));
			resposta[i] = scan.nextInt();
		}
		
		int nota = 0;
		
		for(int i = 0; i < 10; i++) {
			
			if(gabarito[i] == resposta[i]) {
				nota++;
			}
			
		}
		
		System.out.println("A nota foi: "+nota);

		scan.close();
	}

}
