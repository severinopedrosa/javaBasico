package aula17;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Entre com um n�mero:");
			num = entrada.nextInt();
			
			if (num > maior) {
				maior = num;
				System.out.println("O numero maior mudou " + maior);
			}
			
			System.out.println("O maior numero digitado foi: " + maior);
			
		}
		entrada.close();
	}

}
