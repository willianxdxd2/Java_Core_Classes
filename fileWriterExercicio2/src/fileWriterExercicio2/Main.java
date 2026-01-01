package fileWriterExercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\exerciciosfileWriter\\arquivo.txt");

		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("Oi");
			bw.newLine();
			bw.write("Linha 1 ");
			bw.newLine();
			bw.write("Linha 2");
			bw.newLine();
			bw.write("Linha 3");
			bw.newLine();
			bw.write("Linha 4");
			
		}catch(IOException e) {
			e.getMessage();
		}
	}

}
