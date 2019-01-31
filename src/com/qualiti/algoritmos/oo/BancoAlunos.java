package com.qualiti.algoritmos.oo;

import java.util.Scanner;

public class BancoAlunos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno[] banco = new Aluno[5];
		int indice = 0;
		
		int opcao = 0;
		
		do {
			System.out.println("Menu:");
			System.out.println("1 - Sair");
			System.out.println("2 - Cadastrar Aluno");
			System.out.println("3 - Procurar Aluno");
			
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Até logo!");
				break;
				
			case 2:
				
				System.out.println("Digite o nome do aluno");
				String nome = scan.next();
				
				System.out.println("Digite o CPF");
				String cpf = scan.next();
				
				System.out.println("Digite a media");
				double media = scan.nextDouble();
				
				Aluno a = new Aluno();
				a.setNome(nome);
				a.setCpf(cpf);
				a.setMedia(media);
				
				banco[indice] = a;
				indice++;
				
				break;
				
			case 3:
				
				System.out.println("Digite o CPF para Busca");
				String cpfBusca = scan.next();
				
				boolean achou = false;
				
				for(int i = 0; i < banco.length; i++) {
					if(banco[i] != null && banco[i].getCpf().equals(cpfBusca)) {
						System.out.println(banco[i].getNome());
						System.out.println(banco[i].getMedia());
						achou = true;
					}
				}
				
				if(!achou) {
					System.out.println("CPF não cadastrado");
				}
				
				break;
				
			default:
				System.out.println("Opção inválida");
			}
			
		}while(opcao != 1);
		
		scan.close();

	}

}
