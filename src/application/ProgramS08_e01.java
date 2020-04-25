package application;

import entities.Rectangle;
import java.util.Scanner;

public class ProgramS08_e01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle =  new Rectangle();
		
		System.out.println("Enter rectangle width and hiegth:");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
		
		System.out.println(rectangle);

	}

}
