package aula15;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com uma letra (F ou M):");
		String letra = entrada.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - feminino");
		} else if(letra.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo inválido");
		}
		
		entrada.close();
	}

}
