package com.qualiti.algoritmos.generics;

import java.util.ArrayList;
import java.util.List;

public class PilhaInteiro {
	
	private List<Integer> colecao;
	
	public PilhaInteiro() {
		colecao = new ArrayList<>();
	}
	
	public void push(Integer valor) {
		colecao.add(valor);
	}
	
	public Integer pop() {
		int indice = colecao.size() - 1;
		Integer valor = colecao.get(indice);
		colecao.remove(indice);
		return valor;	
	}
	
	public void imprimir() {
		System.out.println(colecao);
	}

}
