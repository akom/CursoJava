import java.util.Scanner;
public class Secao5_e05 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int cantidade = sc.nextInt();
		
		sc.close();
		
		if ( codigo == 1 ) {
			System.out.printf("Total: R$ %.2f", 4.00 * cantidade );
		} else if ( codigo == 2 ) {
			System.out.printf("Total: R$ %.2f", 4.50 * cantidade );
		} else if ( codigo == 3 ) {
			System.out.printf("Total: R$ %.2f", 5.00 * cantidade );
		} else if ( codigo == 4 ) {
			System.out.printf("Total: R$ %.2f", 2.00 * cantidade );
		} else {
			System.out.printf("Total: R$ %.2f", 1.50 * cantidade );
		}
		
	}
}
