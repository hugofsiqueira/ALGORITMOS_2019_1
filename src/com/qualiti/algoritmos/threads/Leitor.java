package com.qualiti.algoritmos.threads;

import java.util.stream.IntStream;

public class Leitor extends Thread {
	
	private String nome;
	private CaixaMensagem caixa;
	
	public Leitor(String nome, CaixaMensagem caixa) {
		this.nome = nome;
		this.caixa = caixa;
	}
	
	public void run() {
		
		IntStream.range(1, 100).forEach(n -> {
			
			caixa.lerMensagem(nome);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

}
