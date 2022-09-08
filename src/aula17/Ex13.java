package aula17;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com a base:");
		int base = entrada.nextInt();
		
		System.out.println("Entre com a potência:");
		int pot = entrada.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i < pot; i++) {
			resultado *= base;
			
		}
		
		System.out.println("Resultado: " + resultado);
		entrada.close();
	}

}
