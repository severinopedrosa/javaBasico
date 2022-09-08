package aula17;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int num;
		int media;
		int soma;
	
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero");
			num = entrada.nextInt();
			
			soma += num;
		}
		media = soma / 5;
		
		System.out.println("soma: " + soma);
		System.out.println("Média: " + media);
	}

}
