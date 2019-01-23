package com.qualiti.algoritmos.aula1;

import java.util.Scanner;

public class MediaProvas {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota da primeira prova");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota da segunda prova");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		System.out.println("A media do aluno foi: "+media);
		
		if(media >= 7) {
			System.out.println("Aluno aprovado");
		}else {
			System.out.println("Aluno reprovado");
		}

		scan.close();
		
	}

}
