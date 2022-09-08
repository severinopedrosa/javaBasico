package aula17;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o numero de turmas");
		int numTurmas = entrada.nextInt();
		
		int numALunos;
		int soma = 0;
		boolean invalido = true;
		
		for (int i = 1; i <= numTurmas; i++) {
			invalido = true;
			do {
				System.out.println("Entre com o numero de alunos da turma " + i);
				numAlunos = entrada.nextInt();
				
				if (numAlunos > 40) {
					invalido = false
				}
			}while (invalido);
			
			soma += numAlunos;
		}

	}

}
