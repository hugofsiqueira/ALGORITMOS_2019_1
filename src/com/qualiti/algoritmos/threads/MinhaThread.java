package com.qualiti.algoritmos.threads;

import java.util.stream.IntStream;

public class MinhaThread extends Thread {
	
	public void run() {
		
		// -> lambda
		IntStream.range(1, 100).forEach(n -> {
			
			System.out.println("BOM DIA "+n);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		});
		
	}

}
