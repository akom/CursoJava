package application;

import java.util.Scanner;
import entities.Rent;

public class ProgramS10_e01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rent[] rent = new Rent[9];
		int n;
		
		System.out.println("How many rooms will be rented?: ");
		n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			String name;
			String email;
			int room;
			System.out.printf("Rent #%d:%n", i+1);
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			
			rent[room-1] = new Rent(name,email);
			System.out.println();
		}
		
		sc.close();
		System.out.println("Busy rooms:");
		
		for( int i = 0; i < rent.length; i++) {
			if ( rent[i] != null) {
				System.out.printf("%d: %s, %s %n",i+1,rent[i].getName(), rent[i].getEmail());
			}
		}
	}

}
