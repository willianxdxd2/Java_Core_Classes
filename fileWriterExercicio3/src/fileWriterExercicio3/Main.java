package fileWriterExercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\exerciciosfileWriter\\exercicio3.txt");
		String[] array = {"Maçã","Banana","Laranja"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			
			for(String a : array) {
				bw.write(a);
				bw.newLine();
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
			}
	}

}
