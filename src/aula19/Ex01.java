package aula19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("ENtre com o valor da posição: " + i);
			vetorA[i] = entrada.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
//		for (int i = 0; i < vetorA.length; i++) {
//			vetorB[i]
//		}
		
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
