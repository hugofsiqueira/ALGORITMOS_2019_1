package com.qualiti.algoritmos.interfac;

public class Passaro implements IVoador {

	@Override
	public void voar() {
		System.out.println("Passaro voando");
	}
	
	public static void main(String[] args) {
		Aviao a = new Aviao();
		Passaro p = new Passaro();
		
		a.voar();
		p.voar();
	}

}
