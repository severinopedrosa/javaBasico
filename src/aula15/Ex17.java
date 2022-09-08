package aula15;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o ano:");
		int ano = entrada.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O "+ ano + " é bissexto.");
		} else {
			System.out.println("O "+ ano + " não é bissexto.");
		}
		entrada.close();
	}

}
