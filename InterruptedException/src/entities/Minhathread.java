package entities;

public class Minhathread extends Thread{
		
	@Override
	public void run() {
		
		for(int i = 0;i<=5;i++) {
			
			System.out.println("Thread: " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			
			
			
		}
		
		
		
	}
	
	
	
	
	
}
