package aula15;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		
		System.out.println("Entre com uma letra:");
		String letra = entrada.next();
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "B":
		case "C":
		case "D":
		case "E":
			System.out.println("vogal");
			break;
			default:
				System.out.println("consoante");
			
		}
		entrada.close();
	}

}
