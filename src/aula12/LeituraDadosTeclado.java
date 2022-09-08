package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = entrada.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = entrada.next();
		System.out.println("Digite seu último nome:");
		String ultimoNome = entrada.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome + ", e sobrenome é: " + ultimoNome);
		
		System.out.println("Digite a sua idade:");
		int idade = entrada.nextInt();
		System.out.println("Você tem " + idade + " anos.");
		
		
	}

}
