package aula15;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		int num = entrada.nextInt();
		
		if(num >= 0) {
			System.out.println("Numero informado � positivo");
		} else {
			System.out.println("N�mero informado � negativo");
		}
	}

}
