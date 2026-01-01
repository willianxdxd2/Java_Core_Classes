package interrupetedException3;

public class MinhaThread extends Thread{
	
	
	public void run() {
		
		while(true) {
			System.out.println("Thread rodando");
			try {Thread.sleep(300);}catch(InterruptedException e){
				e.getMessage();
			}
			
			
			
		}
		
		
	}
}
