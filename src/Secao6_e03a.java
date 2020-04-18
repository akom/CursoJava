import java.util.Scanner;

public class Secao6_e03a {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while ( combustivel != 4 ) {
			switch(combustivel) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
			default:
				break;
			}
			combustivel = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
	}

}
