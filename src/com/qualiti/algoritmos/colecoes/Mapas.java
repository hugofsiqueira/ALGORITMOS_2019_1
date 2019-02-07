package com.qualiti.algoritmos.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		
		Map<String, String> mapaPessoas = new Hashtable<>();
		
		mapaPessoas.put("0455", "Maria");
		mapaPessoas.put("0455", "Joao");
		mapaPessoas.put("0223", "Jose");
		
		String nome = mapaPessoas.get("0223");
		
		System.out.println(nome);
		
		for(String cpf : mapaPessoas.keySet()) {
			System.out.println(cpf);
		}
		
		for(String nomePessoa : mapaPessoas.values()) {
			System.out.println(nomePessoa);
		}
	
		System.out.println(mapaPessoas);
		
		
		Map<String, List<String>> mapaTimes = new HashMap<>();
		
		mapaTimes.put("NE", new ArrayList<>());
		mapaTimes.put("S", new ArrayList<>());
		mapaTimes.put("N", new ArrayList<>());
		mapaTimes.put("SE", new ArrayList<>());
		mapaTimes.put("CO", new ArrayList<>());
		
		List<String> timesSudeste = mapaTimes.get("SE");
		timesSudeste.add("São Paulo");
		timesSudeste.add("Flamengo");
		
		List<String> timesNordeste = mapaTimes.get("NE");
		timesNordeste.add("Sport");
		timesNordeste.add("Bahia");
		
		for(String regiao : mapaTimes.keySet()) {
			
			List<String> times = mapaTimes.get(regiao);
			
			for(String time : times) {
				if(time.startsWith("s") || time.startsWith("S")) {
					System.out.println(time);
				}
			}
		}
		
		System.out.println(mapaTimes);
		
		
		
		

	}

}
