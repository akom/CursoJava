import java.util.Scanner;

public class secao4_e06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		double areaTriangulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadrado;
		double areaRetangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		sc.close();
		
		areaTriangulo = (A * C) / 2;
		areaCirculo = 3.14159 * C * C;
		areaTrapezio = ((A + B) / 2 ) * C;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO; %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
				
	}

}
