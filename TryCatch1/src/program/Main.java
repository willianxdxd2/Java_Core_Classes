package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import exceptions.ZeroBalance;
import exceptions.NoBalance;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		
		System.out.println("Enter Account Data");
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc.next();
		sc.next();
		System.out.println("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.println("withdraw limit");
		Double withdrawLimit = sc.nextDouble();
		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		List <Account> AccList = new ArrayList<>();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		AccList.add(account);
		
		account.withdraw(amount);
		System.out.println("New Balance: " + account.getBalance());
	}catch(NoBalance e) {
		System.out.println("limit pass");
	}
	catch(ZeroBalance e) {
		System.out.println("no balance");
	}finally {
		sc.close();
	}
		
	}
}
