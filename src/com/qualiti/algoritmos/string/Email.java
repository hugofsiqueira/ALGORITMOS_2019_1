package com.qualiti.algoritmos.string;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		String email = null;
		
		do {
			System.out.println("Digite um email");
			email = scan.next();
			
			if(!email.contains("@gmail.com")){
				System.out.println("Email invalido");
			}else {
				System.out.println("Email valido");
				System.out.println(email);
			}
			
		}while(!email.contains("@gmail.com"));
		
		
		scan.close();

	}

}
