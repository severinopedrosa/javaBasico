package aula19;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] vetorA =  new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = entrada.nextInt();
		}
		
		int soma = 0;
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "soma");
		}
		entrada.close();
	}

}
