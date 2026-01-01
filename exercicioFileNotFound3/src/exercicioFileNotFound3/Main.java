package exercicioFileNotFound3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\exerciciosFile\\arquivoinexistente.txt");
		
		try{
			FileReader fr = new FileReader(file);
			
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
		}

	}

}
