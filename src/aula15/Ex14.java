package aula15;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a Nota 1:");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Entre com a Nota 2:");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média de Aproveitamento   Conceito");
		
		if(media >= 9 && media <= 10) {
			System.out.println("Entre 9.0 e 10.0             A");
		}else if(media >= 7.5 && media < 9) {
			System.out.println("Entre 7.5 e 9.0              B");
		}else if(media >= 6 && media < 7.5) {
			System.out.println("Entre 6.0 e 7.5              C");
		}else if(media >= 4 && media < 6) {
			System.out.println("Entre 4.0 e 6.0              D");
		} else if(media >= 0 && media < 4) {
			System.out.println("Entre 4.0 e zero             E");
		}
		
		
	}

}
