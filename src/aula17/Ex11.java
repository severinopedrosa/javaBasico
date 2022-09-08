package aula17;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner entrada = new Scanner(System.in);

			
			System.out.println("Entre com o primeiro numero");
			int num1 = entrada.nextInt();
			
			System.out.println("Entre com o segundo numero");
			int num2 = entrada.nextInt();
			
			int soma = 0;
			
			for (int i = num1; i <= num2; i++) {
				soma += i;
				
			}
			
			System.out.println("Soma: " + soma );
			entrada.close();
		}
	

}
