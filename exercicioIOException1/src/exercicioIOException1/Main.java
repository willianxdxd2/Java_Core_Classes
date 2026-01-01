package exercicioIOException1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File ("C:\\exerciciosFile\\dados.txt");
		String linha;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
		
			while((linha = br.readLine()) != null) {
				String[] palavras = linha.split(",");
				
				System.out.println(linha);
			}
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
