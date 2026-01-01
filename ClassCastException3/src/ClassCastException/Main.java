package ClassCastException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Number[] numeros = new Number[3];
		numeros[0] = 1;
		numeros[1] = 2.5;
		numeros[2] = 3;
		
		try {
			Integer[] inteiros = (Integer[]) numeros;
			
			for(Integer n : inteiros) {
				System.out.println(n);
			}
		}catch(ClassCastException e ) {
			System.out.println("ClassCastException Ocorreu: " + e.getMessage());
		}
		
		
		
		
	}

}
