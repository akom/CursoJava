import java.util.Scanner;

public class secao5_e04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		sc.close();
		
		if ( horaInicial > horaFinal) {
			System.out.printf("O JOGO DURO %d HORA(S)", (24 - horaInicial) + horaFinal );
		} else if ( horaInicial < horaFinal) {
			System.out.printf("O JOGO DURO %d HORA(S)", (horaFinal - horaInicial));
		} else {
			System.out.println("O JOGO DURO 24 HORA(S)");
		}
		
	}

}
