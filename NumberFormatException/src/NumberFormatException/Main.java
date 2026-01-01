package NumberFormatException;

public class Main {

	public static void main(String[] args) {
		String texto = "abc";
		try {
		
		System.out.println(Integer.parseInt(texto));
		}catch(NumberFormatException e) {
			System.out.println("Erro ao converter string: " + e.getMessage());
		}

	}

}
