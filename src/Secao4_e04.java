import java.util.Scanner;

public class Secao4_e04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		int horasTrabalhadas;
		double valorHoraTrabalhada;
		double salario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHoraTrabalhada = sc.nextDouble();
		sc.close();
		
		salario = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("Salary = U$ %.2f",salario);
	}
}
