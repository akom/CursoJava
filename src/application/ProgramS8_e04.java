package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class ProgramS8_e04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double price;
		double dollar;
		
		System.out.print("What is the dollar price? ");
		price = sc.nextDouble();
		System.out.print("How many dollars will be bougth? ");
		dollar = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convert(price, dollar));
	}

}
