package aula15;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner entrada = new Scanner(System.in);

			System.out.println("Digite o primeiro n�mero:");
			int num1 = entrada.nextInt();
			
			System.out.println("Digite o segundo n�mero:");
			int num2 = entrada.nextInt();
			
			System.out.println("Digite o terceiro n�mero:");
			int num3 = entrada.nextInt();
			
			if(num1 > num2 && num1 > num3) {
				System.out.println("num1 � maior: " + num1);
			}else if(num2 > num1 && num2 > num3) {
				System.out.println("num2 � maior: " + num2);
			} else if(num3 > num1 && num3 > num2) {
				System.out.println("num3 � maior: " + num3);
			}
			
			if(num1 < num2 && num1 < num3) {
				System.out.println("num1 � menor: " + num1);
			}else if(num2 < num1 && num2 < num3) {
				System.out.println("num2 � menor: " + num2);
			} else if(num3 < num1 && num3 < num2) {
				System.out.println("num3 � menor: " + num3);
			}
		
	}
}
