package main;

public class MinhaThread2 extends Thread{
	
	private MinhaThread t;
	public void run() {
		
		for(int i  = 0 ; i <= 20 ; i++) {
		System.out.println("Thread2 rodando");
		try {Thread.sleep(300);}catch(InterruptedException e) {
			e.getMessage();
		}
		if(i == 10) {
		
		this.t.interrupt();
		}
	}}
	public MinhaThread2(MinhaThread t) {
		super();
		this.t = t;
	}
	}

