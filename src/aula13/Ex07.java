package aula13;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calcular a �rea do quadrado");
		
		double lado = entrada.nextInt();
		
		double area = Math.pow (lado, 2);
		 
		System.out.println("A �rea do quadrado � " + area);
		System.out.println("A dobro da �rea do quadrado � " + (area*2));
	}

}
