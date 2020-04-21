package application;

import java.util.Scanner;
import entities.Employee;

public class ProgramS8_e02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
	
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		employee.IncreaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
