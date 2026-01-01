package NumberFormatException;

public class Main {

	public static void main(String[] args) {
		String texto = "12.34.56";
		try {
		Double.parseDouble(texto);
		}catch(NumberFormatException e) {
			System.out.println("Erro ao tratar exceção " + e.getMessage());
		}
	}

}
