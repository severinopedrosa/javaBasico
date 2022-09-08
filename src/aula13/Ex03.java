package aula13;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num1 = entrada.nextInt();
		System.out.println("Digite outro número");
		int num2 = entrada.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma entre "+ num1 + " + " +num2+ " = " + soma);
	}

}
