import java.util.Scanner;

public class Secao6_e01b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		
		if ( x >= 1 && x <= 1000) {
			
			for( int i = 0; i <= x; i++ ) {
				if ( i % 2 != 0 ) {
					System.out.printf("%d%n",i);
				}
			}
		}
		
		sc.close();
	}
}