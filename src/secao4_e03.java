import java.util.Scanner;

public class secao4_e03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		
		diferenca = (a*b-c*d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
	}
	
}
