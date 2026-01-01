package entities;

public class Interromper {
	
	private MinhaThread1 t1 ;
	private MinhaThread2 t2 ;
	private MinhaThread3 t3 ;
	public Interromper(MinhaThread1 t1, MinhaThread2 t2, MinhaThread3 t3) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	public void parar() {

		this.t1.interrupt();
		this.t2.interrupt();
		this.t3.interrupt();
	}
	
}
