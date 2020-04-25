package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Funcionario;
import java.util.Locale;


public class ProgramS10_e02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		
		System.out.println("How many employees will be registered?	");
		int n = sc.nextInt();
		
		for( int i =1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + i +": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new Funcionario(id,name,salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Funcionario func = list.stream().filter( x -> x.getId() == id).findFirst().orElse(null);
		
		if ( func != null) {
		
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func.incremetoSalario(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
	
		System.out.println();
		System.out.println("List of employee:");
		
		for ( Funcionario obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
		
	}

}
