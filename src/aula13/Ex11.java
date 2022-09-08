package aula13;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite um número inteiro:");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite um número real:");
		double num3 = entrada.nextDouble();
		
		int produto = (num1 * 2) * (num2 / 2);
		System.out.println("Produto do dobro do primeiro com a metade do segundo: " + produto);
		
		double soma = ((num1 * 3) + num3);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
		
		double cubo = Math.pow (num3, 3);
		System.out.println("O terceiro elevado ao cubo: " + cubo);
	}

}
