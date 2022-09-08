package aula17;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		System.out.println(num + "! = " + num + " * ");
		
		int fatorial = 1;
		
		for (int i = num;  i> 0; i--) {
			fatorial *= i;
			System.out.println(i + " * ");
		}
		entrada.close();
		System.out.println("Resultado " + fatorial);
	}

}
