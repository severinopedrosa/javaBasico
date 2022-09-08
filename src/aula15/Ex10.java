package aula15;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o turno que você estuda: ");
		String turno = entrada.next();
		
		switch(turno) {
		case "m":
		case "M":
			System.out.println("Bom dia!");
			break;
		case "v":
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "n":
		case "N":
			System.out.println("Boa noite!");
			break;
			default: System.out.println("Valor inválido.");
		}
		
	}

}
