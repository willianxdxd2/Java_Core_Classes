package parseException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		try {
		String data = "31/02/2025";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		sdf.setLenient(false);
		Date dataformatada = sdf.parse(data);
		
		System.out.println(dataformatada);
		}
		catch(ParseException e) {
			
			System.out.println("---Erro ao formatar data---" + e.getMessage());
			
		}

	}

}
