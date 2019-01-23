package com.qualiti.algoritmos.aula1;

import java.util.Scanner;

public class ClassificarTriangulos {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado");
		double l1 = scan.nextDouble();
		
		System.out.println("Digite o segundo lado");
		double l2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro lado");
		double l3 = scan.nextDouble();
		
		if(l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2) {
			
			if(l1 != l2 && l2 != l3 && l1 != l3) {
				System.out.println("Triângulo escaleno");
			}else if(l1 == l2 && l1 == l3) {
				System.out.println("Triângulo equilátero");
			}else {
				System.out.println("Triângulo isósceles");
			}
			
		}else {
			System.out.println("Não é possivel formar um triângulo");
		}
		
		
		scan.close();
	}

}
