package ClassCastExceptio;

public class Main {

	public static void main(String[] args) {
		
		animal animall = new gato();
		
		try {
			cachorro dog = (cachorro) animall;
		}catch(ClassCastException e ) {
			System.out.println("Impossivel transicionar: " + e.getMessage());
		}
		
		
		
		
	}

}
