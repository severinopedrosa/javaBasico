package aula17;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Digite uma nota entre 0 e 10");
			double nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				//notaValida = false;
				System.out.println("Nota inválida, digite novamente.");
			}
			
		} while (!notaValida);

		
		
		
	}

}
