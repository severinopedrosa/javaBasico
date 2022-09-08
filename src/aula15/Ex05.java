package aula15;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com a primeira nota");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("APROVADO com Distinção");
		} else if(media >= 7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
		System.out.println("A média é: " + media);
		entrada.close();
	}

}
