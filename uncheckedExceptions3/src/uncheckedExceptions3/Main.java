package uncheckedExceptions3;

public class Main {

	public static void main(String[] args) {
		funcao func =  new funcao();
		String nada = null;
		
		try {
		func.imprimir(nada);
		}catch(NullPointerException e) {
			System.out.println("Objeto passado como nada " + e.getMessage());
		}
	}

}
