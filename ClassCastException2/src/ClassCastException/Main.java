package ClassCastException;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Object> objetos = new ArrayList<>();
		
		String texto = "123";
		objetos.add(texto);
		try {
		Integer numero = (Integer) objetos.get(0);
		System.out.println(numero);
		}catch(ClassCastException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
