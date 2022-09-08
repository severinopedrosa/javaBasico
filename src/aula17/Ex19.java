package aula17;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o numero de notas:");
		int notas = entrada.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		for (int i = 0; i < notas; i++) {
			System.out.println("Entre com a nota " + (i + 1));
			nota = entrada.nextDouble();
			
			soma += nota;
			
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
