package com.qualiti.algoritmos.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TesteConjunto {

	public static void main(String[] args) {
		
		Set<Integer> idadesSet = new HashSet<>();
		
		idadesSet.add(3);
		idadesSet.add(20);
		idadesSet.add(20);
		idadesSet.add(80);
		
		List<Integer> idadesList = new ArrayList<>(idadesSet);
		Collections.sort(idadesList);
		
		System.out.println(idadesSet);
		System.out.println(idadesList);
		
		SortedSet<Integer> idadesOrdenadas = new TreeSet<>();
		idadesOrdenadas.add(9);
		System.out.println(idadesOrdenadas);
		
		idadesOrdenadas.add(2);
		System.out.println(idadesOrdenadas);
		
		idadesOrdenadas.add(25);
		System.out.println(idadesOrdenadas);
		
		idadesOrdenadas.add(1);
		System.out.println(idadesOrdenadas);
		
		

	}

}
