package aula19;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre  com o valor da posi��o " + i);
			vetorA[i] = entrada.nextInt();
			
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	}

}
