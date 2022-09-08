package aula17;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor de n");
		int n = entrada.nextInt();
		
		double soma = 0;
		
		for (int i = 1; i <= n; i++) {
			
			//System.out.print(i + "/" + j + " + ");
			
			soma += 1/i;
		}
		
		System.out.println("Soma = " + soma);
		entrada.close();
	}

}
