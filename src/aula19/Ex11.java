package aula19;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição "  + i);
			vetorA[i] = entrada.nextInt();
		}
		
		int qtdPares = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			}
			
		}
		
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(" Qtd numero de pares: " + qtdPares);
	}

}
