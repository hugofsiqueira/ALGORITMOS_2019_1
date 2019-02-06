package com.qualiti.algoritmos.colecoes;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
	
	public static void main(String[] args) {
		
		List<String> nomesList = new ArrayList<>();
		
		nomesList.add("Maria");
		nomesList.add("Jose");
		
		int tamanho = nomesList.size();
		System.out.println(tamanho);
		
		if(nomesList.isEmpty()) {
			
		}
		
		nomesList.remove("Maria");
		System.out.println(nomesList.size());
		
		nomesList.add("Jose");
		nomesList.add("Ana");
		nomesList.add("Pedro");
		
		System.out.println(nomesList);
		
		if(nomesList.contains("Pedro")) {
			System.out.println("Pedro está na lista");
		}
		
		nomesList.remove("Ana");
		System.out.println(nomesList);
			
		
		
	}

}
