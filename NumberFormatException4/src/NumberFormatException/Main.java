package NumberFormatException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algo: ");
		String digito = sc.nextLine();
		
		try {
			Double novo_numero = Double.parseDouble(digito);
			System.out.println("Numero digitado: " + novo_numero);
		}catch(NumberFormatException e) {
			
			System.out.println("Erro ao converter: " + e.getMessage());
		}
		
		
	}

}
