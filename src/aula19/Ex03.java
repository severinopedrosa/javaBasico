package aula19;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = entrada.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i]; 
		}
		
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
	}

}
