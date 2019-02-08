package com.qualiti.algoritmos.generics;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
	
	private List<T> colecao;
	
	public Pilha() {
		colecao = new ArrayList<>();
	}
	
	public void push(T elemento) {
		colecao.add(elemento);
	}
	
	public T pop() {
		int indice = colecao.size() - 1;
		T elemento = colecao.get(indice);
		colecao.remove(indice);
		return elemento;	
	}
	
	public void imprimir() {
		System.out.println(colecao);
	}

}
