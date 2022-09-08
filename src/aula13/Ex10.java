package aula13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Celsius: ");
		
		double c = entrada.nextInt();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("Temperatura = " + f + "° F");
	}

}
