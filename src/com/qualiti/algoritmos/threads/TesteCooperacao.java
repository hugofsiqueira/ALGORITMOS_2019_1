package com.qualiti.algoritmos.threads;

public class TesteCooperacao {

	public static void main(String[] args) {
		
		CaixaMensagem caixa = new CaixaMensagem();
		
		Escritor esc1 = new Escritor("ESC1", caixa, "Bom dia");
		Escritor esc2 = new Escritor("ESC2", caixa, "Boa tarde");
		
		Leitor l1 = new Leitor("L1", caixa);
		Leitor l2 = new Leitor("L2", caixa);
		
		esc1.start();
		esc2.start();
		l1.start();
		l2.start();
		

	}

}
