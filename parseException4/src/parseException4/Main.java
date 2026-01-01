package parseException4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\datas\\datas_formulario.txt");
		String linhas;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((linhas = br.readLine()) != null) {
					try {
					SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
					sdf.setLenient(false);
					Date dataformatada = sdf.parse(linhas);
					System.out.println("Data formatada: " + dataformatada);
					
				}catch(ParseException e ) {
				
				System.out.println("Erro ao formatar data " + e.getMessage());
				}
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
