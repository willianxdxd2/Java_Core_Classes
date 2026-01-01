package ClassCastException;

public class Main {

	public static void main(String[] args) {
		
		
		try {
		Object o = new Object();
		
		Object a = (String) o ;
		}catch(ClassCastException e) {
			System.out.println("Erro de classe: " + e.getMessage());
		}
		
		
		
	}

}
