package com.qualiti.algoritmos.string;

import java.util.Scanner;

public class UsuarioEmail {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um email");
		String email = scan.next();
		
		int indiceArroba = email.indexOf("@");
		
		String login = email.substring(0, indiceArroba);
		
		System.out.println(login);
		
		
		
		scan.close();

	}

}
