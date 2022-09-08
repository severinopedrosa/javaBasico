package aula13;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Digite a 3ª nota: ");
		double nota3 = entrada.nextDouble();
		
		System.out.println("Digite a 4ª nota: ");
		double nota4 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A Média é " + media);
		
		
		
	}

}
