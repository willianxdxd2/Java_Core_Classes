package entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\datas\\datas.txt");
		String linhas;
		Integer cont = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			
			while((linhas = br.readLine()) != null) {
				
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					sdf.setLenient(false);
					Date dataformatada = sdf.parse(linhas);
					
					
				}catch(ParseException e) {
					System.out.println("Erro ao tratar data " + e.getMessage());
					cont++;
				}
				
				
			}
			
			
		}catch(IOException e) {
			System.out.println("Erro ao ler arquivo " + e.getMessage());
		}
		
		System.out.println("Total de datas inválidas: " + cont);
		
		
		

	}

}
