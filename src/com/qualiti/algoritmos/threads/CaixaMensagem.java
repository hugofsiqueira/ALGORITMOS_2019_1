package com.qualiti.algoritmos.threads;

public class CaixaMensagem {
	
	private String mensagem;
	
	public synchronized void escreverMensagem(String mensagem, String nome) {
		
		if(this.mensagem == null) {
			this.mensagem = mensagem;
			System.out.println(nome+" escreveu "+mensagem);
			notifyAll();
		}else {
			while(this.mensagem != null) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			escreverMensagem(mensagem, nome);
		}
		
	}
	
	public synchronized void lerMensagem(String nome) {
		
		if(this.mensagem != null) {
			System.out.println(nome + " leu "+this.mensagem);
			this.mensagem = null;
			notifyAll();
		}else {
			while(this.mensagem == null) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			lerMensagem(nome);
		}
	}

}
