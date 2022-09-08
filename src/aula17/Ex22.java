package aula17;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o numero do cd");
		int cds = entrada.nextInt();
		
		double preco;
		double soma = 0;
		
		for (int i = 1; i < cds; i++) {
			
			System.out.println("Informe o valor do cd " + i);
			preco = entrada.nextDouble();
			
			soma += preco;
			
		}
		
		double media = soma / cds;
		
		System.out.println("Media gasta com cada cd " + media);
		
	}

}
