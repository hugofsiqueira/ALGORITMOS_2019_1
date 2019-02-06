package com.qualiti.algoritmos.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCachorro {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		c1.setNome("bolinha");
		c1.setIdade(1);
		
		Cachorro c2 = new Cachorro();
		c2.setNome("toto");
		c2.setIdade(3);
		
		Cachorro c3 = new Cachorro();
		c3.setNome("mel");
		c3.setIdade(5);
		
		Cachorro c4 = new Cachorro();
		c4.setNome("mel");
		c4.setIdade(5);
		
		List<Cachorro> cachorrosList = new ArrayList<>();
		
		cachorrosList.add(c1);
		cachorrosList.add(c2);
		cachorrosList.add(c3);
		
		cachorrosList.remove(c2);
		
		System.out.println(cachorrosList);
		
		cachorrosList.remove(c4);
		
		System.out.println(cachorrosList);
		
		cachorrosList.add(c1);
		cachorrosList.add(c2);
		cachorrosList.add(c3);
		cachorrosList.add(c4);
		// Arrays.sort(a);
		Collections.sort(cachorrosList);
		
		System.out.println(cachorrosList);
	}

}
