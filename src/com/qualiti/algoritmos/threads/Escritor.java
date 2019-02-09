package com.qualiti.algoritmos.threads;

import java.util.stream.IntStream;

public class Escritor extends Thread {
	
	private String nome;
	private CaixaMensagem caixa;
	private String texto;
	
	public Escritor(String nome, CaixaMensagem caixa, String texto) {
		this.nome = nome;
		this.caixa = caixa;
		this.texto = texto;
	}
	
	public void run() {
		
		IntStream.range(1, 100).forEach(n -> {
			
			caixa.escreverMensagem(texto, nome);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

}
