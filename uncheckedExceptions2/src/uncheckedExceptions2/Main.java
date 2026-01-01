package uncheckedExceptions2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lista = null;
		try {
		for(String item : lista) {
			System.out.println(item);
		}
		}catch(NullPointerException e) {
			System.out.println("Ponteiro está nulo não há nada "  + e.getMessage());
		}
		
	}

}
