package aula13;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calcular a Área do quadrado");
		
		double lado = entrada.nextInt();
		
		double area = Math.pow (lado, 2);
		 
		System.out.println("A área do quadrado é " + area);
		System.out.println("A dobro da área do quadrado é " + (area*2));
	}

}
