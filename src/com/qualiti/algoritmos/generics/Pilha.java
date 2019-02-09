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
	
	//? extends Number
	public static void imprimirLista(List<?> listaElementos) {
		listaElementos.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("joao");
		
		List<Integer> idades = new ArrayList<>();
		idades.add(10);
		idades.add(18);
		
		Pilha.imprimirLista(nomes);
		Pilha.imprimirLista(idades);
		
	}
	
	public void imprimir() {
		System.out.println(colecao);
	}
	

}
