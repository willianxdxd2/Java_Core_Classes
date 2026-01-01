package uncheckedExceptions;

public class Main {

	public static void main(String[] args) {
		
		try {
		String nome = null;
		nome.length();
		}catch(NullPointerException e ) {
			System.out.println("Erro em algo q não existe" + e.getMessage());
		}
	}

}
