package aula15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com primeiro n�mero");
		int num1 = entrada.nextInt();
		
		System.out.println("Entre com segundo n�mero");
		int num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("N�mero " + num1 + " � maior.");
		} else {
			System.out.println("N�mero " + num2 + " � maior.");
		}
		
		
	}

}
