package aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com um numero");
		int num = entrada.nextInt();
		
		System.out.println("Entre com um limite");
		int max = entrada.nextInt();
		
		for (int i = num; i <= max; i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
			
		}
	}

}
