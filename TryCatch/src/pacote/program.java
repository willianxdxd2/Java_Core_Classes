package pacote;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("posição invalida");
		}catch(InputMismatchException e) {
			System.out.println("posicao invalida");
		}

	}

}
