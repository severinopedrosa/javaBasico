package aula17;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		boolean infoValidas = false;
		String nome;
		String senha;
		
		do {
			System.out.println("Entre com o nome do usuario");
			nome = entrada.next();
			
			System.out.println("Entre com a senha");
			senha = entrada.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha igual a usuario, digite novamente.");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuarios válidos");
			}
		} while (!infoValidas);
	
	}

}
