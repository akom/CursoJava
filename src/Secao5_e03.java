import java.util.Scanner;

public class Secao5_e03 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if ( a % b == 0 || b % a == 0 ) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Maultiplos");
		}
		
	}
}
