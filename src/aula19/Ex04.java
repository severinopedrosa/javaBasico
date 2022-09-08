package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
			int[] vetorA = new int[5];
			double[] vetorB = new double[vetorA.length];
		
			for (int i = 0; i < vetorA.length; i++) {
			
				System.out.println("Entre com o valor da posição: " + i);
				vetorA[i] = entrada.nextInt();
			
				vetorB[i] = Math.sqrt(vetorA[i]); 
			}
		
			System.out.println("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i] + " ");
			}
			System.out.println();
			
			//DecimalFormat df = new DecimalFormat("###.###,##");
			
			System.out.println("Vetor B = ");
			for (int i = 0; i < vetorB.length; i++) {
				System.out.println(vetorB[i] + " ");
			}
			System.out.println();
	}

}
