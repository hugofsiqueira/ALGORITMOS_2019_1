package com.qualiti.algoritmos.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Notas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SortedSet<Double> notas = new TreeSet<>();
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite uma nota");
			double nota = scan.nextDouble();
			
			notas.add(nota);
			
		}
		
		List<Double> listaNotas = new ArrayList<>(notas);
		Collections.reverse(listaNotas);
		
		System.out.println(listaNotas);
		
		scan.close();
	}

}
