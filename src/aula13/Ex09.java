package aula13;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Farenheit: ");
		
		int f = entrada.nextInt();
		
		int c = (5 * (f-32) / 9);
		
		System.out.println("Temperatura = " + c + "° C");
	}

}
