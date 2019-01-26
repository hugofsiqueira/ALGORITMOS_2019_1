package com.qualiti.algoritmos.string;

import java.util.Scanner;

public class DadosPessoa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nomes = new String[5];
		String[] cpfs = new String[5];
		String[] datas = new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o nome");
			nomes[i] = scan.next();
			
			System.out.println("Digite o CPF");
			cpfs[i] = scan.next();
			
			System.out.println("Digite a data de nascimento");
			datas[i] = scan.next();
			
		}
		
		scan.close();

	}

}
