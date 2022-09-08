package aula15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com primeiro número");
		int num1 = entrada.nextInt();
		
		System.out.println("Entre com segundo número");
		int num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("Número " + num1 + " é maior.");
		} else {
			System.out.println("Número " + num2 + " é maior.");
		}
		
		
	}

}
