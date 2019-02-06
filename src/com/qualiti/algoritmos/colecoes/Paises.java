package com.qualiti.algoritmos.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paises {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<String> paisesList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o nome de um país");
			String pais = scan.next();
			
			paisesList.add(pais);
			
		}
		
		//foreach
		for(String pais : paisesList) {
			
			if(pais.startsWith("a") || pais.startsWith("A")) {
				System.out.println(pais);
			}
			
		}
		
		System.out.println(paisesList.get(4));
		
		paisesList.set(2, "Inglaterra");
		
		System.out.println(paisesList);
		
		scan.close();

	}

}
