package application;

import entities.Student;
import java.util.Scanner;

public class ProgramS08_e03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student =  new Student();
		
		System.out.print("Name :");
		student.name = sc.nextLine();
		student.firstNote = sc.nextDouble();
		student.secondNote = sc.nextDouble();
		student.thirdNote = sc.nextDouble();
		
		sc.close();
		
		System.out.println(student);
		

	}

}
