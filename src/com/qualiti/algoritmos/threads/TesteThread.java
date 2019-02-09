package com.qualiti.algoritmos.threads;

import java.util.stream.IntStream;

public class TesteThread {

	public static void main(String[] args) {
		
		MinhaThread m1 = new MinhaThread();
		
		m1.start();
		
		MeuRunnable r1 = new MeuRunnable();
		Thread t2 = new Thread(r1);
		
		t2.start();
		
		IntStream.range(1, 100).forEach(n -> {
			System.out.println("MAIN "+n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
	}

}
