package com.qualiti.algoritmos.threads;

import java.util.stream.IntStream;

public class MeuRunnable implements Runnable {

	@Override
	public void run() {
		
		// -> lambda
		IntStream.range(1, 100).forEach(n -> {
			
			System.out.println("RUNNABLE "+n);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		});
		
	}
	
	

}
