package uncheckedExceptions4;

public class Main {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		
		for (int i = 0; i < pessoas.length; i++) {
		    pessoas[i].falar();
		}

	}

}
