package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = entrada.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = entrada.next();
		System.out.println("Digite seu �ltimo nome:");
		String ultimoNome = entrada.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome + ", e sobrenome �: " + ultimoNome);
		
		System.out.println("Digite a sua idade:");
		int idade = entrada.nextInt();
		System.out.println("Voc� tem " + idade + " anos.");
		
		
	}

}
