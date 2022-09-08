package aula15;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o lado 1:");
		int lado1 = entrada.nextInt();
		
		System.out.println("Entre com o lado 2:");
		int lado2 = entrada.nextInt();
		
		System.out.println("Entre com o lado 3:");
		int lado3 = entrada.nextInt();
		
		if(((lado1 + lado2) > lado3) ||
				((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			
		} if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("Triangulo Equilátero");
		} else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
			System.out.println("Triangulo Escaleno");
		} else
			
		
		entrada.close();
	}

}
