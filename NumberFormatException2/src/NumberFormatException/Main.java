package NumberFormatException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\numberformat\\arquivo.txt");
		
		String linhas;
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			linhas = br.readLine();
			
			
			
			
		}catch(IOException e) {
			System.out.println("Erro ao ler arquivo" + e.getMessage());
		}

	}

}
