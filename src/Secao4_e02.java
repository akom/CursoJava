import java.util.Scanner;

public class Secao4_e02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double PI = 3.14159;
		double area;
		
		raio = sc.nextDouble();
		sc.close();
		
		area = PI * raio * raio;
		
		System.out.printf("A = %.4f", area);

	}

}
