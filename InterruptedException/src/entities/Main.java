package entities;

public class Main {

	public static void main(String[] args) {
		Minhathread t = new Minhathread();
		t.start();
		
		
		for(int i = 1; i <= 5;i++) {
			System.out.println("Main: " + i);
			try {Thread.sleep(5000);}catch(InterruptedException e) {
				
			}
			
		}
		

	}

}
