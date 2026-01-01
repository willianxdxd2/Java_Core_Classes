package NumberFormatException;

import java.util.ArrayList;

public class funcao {

	
	
	public Double funcao(String item) {
		
		
		
		try {
			
			Double novo_item = Double.parseDouble(item);
			return novo_item;
		}catch(NumberFormatException e) {
			System.out.println("Erro ao converter" + e.getMessage());
		}
		
		return null;
	}
	
	
}
