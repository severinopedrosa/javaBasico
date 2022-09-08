package aula13;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o raio do círculo:");
		double raio = entrada.nextDouble();
		
		double area = Math.PI * Math.pow (raio, 2);
		
		System.out.println("A área do circulo é " + area);
	}

}
