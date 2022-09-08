package aula17;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com a quantidade de idades:");
		int idade = entrada.nextInt();
		
		
		int soma = 0;
		
		for (int i = 0; i < idade; i++) {
			System.out.println("Entre com a idade da pessoa " + (i + 1));
			idade = entrada.nextInt();
			
			soma += idade;
			
		}
		
		double media = soma / idade;
		
		if(media >= 0 && media <= 25) {
			System.out.println("jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("adulta");
		} else if (media > 60) {
			System.out.println("idosa");
		}
	}

}
