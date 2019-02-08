package com.qualiti.algoritmos.generics;

public class TestePilha {

	public static void main(String[] args) {
		
		Pilha<String> pilha = new Pilha<>();
		
		pilha.push("a");
		pilha.imprimir();
		pilha.push("b");
		pilha.imprimir();
		pilha.push("c");
		pilha.imprimir();
		pilha.pop();
		pilha.imprimir();
		
		Pilha<Integer> pilhaInteiros = new Pilha<>();
		pilhaInteiros.push(7);
		

	}

}
