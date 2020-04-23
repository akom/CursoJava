package application;

import java.util.Scanner;
import entities.Account;

public class ProgramS9_e05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int number;
		String holder;
		double initialDeposit;
		char response;
		Account account;
		
		System.out.print("Enter account numer: ");
		number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		response = sc.next().charAt(0);
		
		
		if ( response == 'y') {
			System.out.print("Enter initial deposit value:" );
			initialDeposit = sc.nextDouble();
			account = new Account(number,holder,initialDeposit );
		} else {
			account = new Account(number,holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println(account.toString());
		
		sc.close();

	}

}
