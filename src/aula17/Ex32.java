package aula17;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		boolean naoTerminar = false;
		
		do {
			System.out.println("Digite o código e a quantidade. Digite 0 0  para sair.");
			cod = entrada.nextInt();
			qtd = entrada.nextInt();
		}while(naoTerminar);
		entrada.close();
	}

}
