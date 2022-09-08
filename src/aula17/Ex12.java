package aula17;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o numero para gerar a tabuada:");
		
		int num = entrada.nextInt();
		
		System.out.println("Tabuada de " + num + ":");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
			
		}
		entrada.close();
	}

}
