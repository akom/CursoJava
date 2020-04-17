import java.util.Scanner;

public class secao4_e01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		System.out.printf("SOMA = %d", a+b);
	}
}
