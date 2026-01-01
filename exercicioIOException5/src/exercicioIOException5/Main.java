package exercicioIOException5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\exerciciosFile\\ioexception5.txt");
		int c;
		int count = 0;
		ArrayList<Integer> linhas = new ArrayList<>();
		try(FileReader fr = new FileReader(file)){
			while(((c = fr.read())!= -1)) {
				char caractere = (char) c;
				count++;
				if(caractere == '\n') {
					linhas.add(count);
					count = 0;
				}
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for (int linha : linhas) {
			System.out.println("Quantidade de caractere por linha: " + linha);
		}

	}

}
