package aula17;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com um numero");
		
		int num = entrada.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("Não é numero primo - divisivel por " + i);
				primo = false;
			}
			
		}
		
		if(primo) {
			System.out.println("É numero primo");
		}
		entrada.close();
	}

}
