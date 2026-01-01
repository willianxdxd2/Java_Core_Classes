package exceptions;

public class ZeroBalance extends Exception{
	private static final long serialVersionUID = 1L;
	public ZeroBalance(String msg) {
		super(msg);
	}
}
