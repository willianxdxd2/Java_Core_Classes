package arrayIndexOutOfBoundsException3;

public class Main {

	public static void main(String[] args) {
		int[]array = {10,20,30,40,50};
		int indicepararemover = 8;
		
		try {
		
			int valor = array[indicepararemover];
			
		}catch(ArrayIndexOutOfBoundsException  e) {
			
			System.out.println("Exceção capturada: " + e.getMessage());
		}

	}

}
