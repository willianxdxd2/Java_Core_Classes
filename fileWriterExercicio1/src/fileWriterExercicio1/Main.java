package fileWriterExercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\exerciciosfileWriter\\saida.txt");
		try(FileWriter fw = new FileWriter("C:\\exerciciosfileWriter\\saida.txt")){
			fw.write("Olá mundo\n ");
			fw.write("Escrevendo no arquivo");
		}catch(IOException e) {
			e.getMessage();
		}
	}

}
