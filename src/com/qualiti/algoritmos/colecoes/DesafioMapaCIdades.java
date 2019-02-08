package com.qualiti.algoritmos.colecoes;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DesafioMapaCIdades {
	
	private static void exibirMenu() {
		System.out.println("Digite a opção desejada");
		System.out.println("1 - Sair");
		System.out.println("2 - Cadastrar Bairro");
		System.out.println("3 - Listar Bairros");
	}
	
	private static void cadastrarBairro(Map<String, Set<String>> mapaCidades, 
								Scanner scan) {
		
		System.out.println("Digite a cidade que o bairro pertence");
		String cidade = scan.next();
		
		System.out.println("Digite o bairro desejado");
		String bairro = scan.next();
		
		if(mapaCidades.containsKey(cidade)) {
			Set<String> bairrosCidade = mapaCidades.get(cidade);
			bairrosCidade.add(bairro);
		}else {
			Set<String> bairrosSet = new HashSet<>();
			bairrosSet.add(bairro);
			
			mapaCidades.put(cidade, bairrosSet);
		}
		
	}
	
	private static void listarBairros(Map<String, Set<String>> mapaCidades, 
			Scanner scan) {
		
		System.out.println("Digite a cidade");
		String cidade = scan.next();
		
		if(mapaCidades.containsKey(cidade)) {
			
			Set<String> bairros = mapaCidades.get(cidade);
			bairros.forEach(bairro -> System.out.println(bairro));
			
			//bairros.forEach(System.out::println);
			
		}else {
			System.out.println("Cidade não cadastrada");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String, Set<String>> mapaCidades = new Hashtable<>();
		
		int opcao = 0;
		do {
			
			exibirMenu();
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Obrigado por usar o sistema");
				break;
				
			case 2:
				cadastrarBairro(mapaCidades, scan);
				break;
			
			case 3:
				listarBairros(mapaCidades, scan);
				break;
				
			default:
				System.out.println("Opcão inválida");
			}
			
		}while(opcao != 1);
		
		scan.close();

	}
}
