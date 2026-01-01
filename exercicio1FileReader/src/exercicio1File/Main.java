package exercicio1File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("C:\\exerciciosFile\\exerciciofile1.txt");
		Scanner sc = null;
		System.out.println("Lendo um caractere por vez");
		try(FileReader fr = new FileReader(file))
		{
			Integer cont = 0;	
			sc = new Scanner(file);
			int ch;
			while((ch = fr.read())!=-1)
			{
				char c = (char)ch;				
				System.out.println(cont +"-"+ c);
				cont++;
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			sc.close();
		}
	}

}
