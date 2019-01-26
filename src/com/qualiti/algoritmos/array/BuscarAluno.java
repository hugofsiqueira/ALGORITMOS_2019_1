package com.qualiti.algoritmos.array;

import java.util.Scanner;

public class BuscarAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tam = 5;
		String[] nomes = new String[tam];
		double[] medias = new double[tam];
		
		for(int i = 0; i < tam; i++) {
			System.out.println("Digite o nome do aluno");
			nomes[i] = scan.next();
			
			System.out.println("Digite a media do aluno");
			medias[i] = scan.nextDouble();
		}
		
		System.out.println("Digite o nome para busca");
		String nomeBusca = scan.next();
		
		for(int i = 0; i < tam; i++) {
			
			if(i == 2) {
				continue;
			}
			
			if(nomes[i].equals(nomeBusca)) {
				System.out.println("A nota do aluno foi: "+medias[i]);
				break;
			}
		}
		
		scan.close();
		
	}

}
