package aula15;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o valor de a:");
		int a = entrada.nextInt();
		
		if (a == 0) {
			System.out.println("Não é equação de 2 grau");
		} else {
		
		System.out.println("Entre com o valor de b:");
		int b = entrada.nextInt();
		
		System.out.println("Entre com o valor de c:");
		int c = entrada.nextInt();
		entrada.close();
		
		double delta = (b * b) - (4 * a * c);
		if (delta < 0 ) {
			System.out.println("Delta negativo");
		} else {
			
			System.out.println("delta = " + delta);
			double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		}
	}

}
