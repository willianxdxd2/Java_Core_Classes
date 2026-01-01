package exercicioIOException2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\exerciciosFile\\saida.txt");
		int c;
		try(FileWriter fw = new FileWriter(file)){
			fw.write("Pedro,Joaquim,Fernandes,Rodrigo,Afonso");
		
		}catch(IOException e) {
			e.getMessage();
		}
		
	}

}
