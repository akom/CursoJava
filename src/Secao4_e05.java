import java.util.Scanner;

public class Secao4_e05 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1;
		int codigoPeca2;
		int numeroPeca1;
		int numeroPeca2;
		double valorUPeca1;
		double valorUPeca2;
		double valorTotal;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUPeca2 = sc.nextDouble();
		
		sc.close();
		
		valorTotal = numeroPeca1 * valorUPeca1 + numeroPeca2 * valorUPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
	}
}
