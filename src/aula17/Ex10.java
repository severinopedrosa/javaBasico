package aula17;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		
		System.out.println("Entre com o primeiro numero");
		int num1 = entrada.nextInt();
		
		System.out.println("Entre com o segundo numero");
		int num2 = entrada.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
			
		}
		entrada.close();
	}

}
