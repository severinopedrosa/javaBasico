package aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32.3;
		temperaturas[2] = 33.3;
		temperaturas[3] = 32.3;
		temperaturas[4] = 31.3;
		
		System.out.println("Valor da tempretura no dia " + temperaturas[0]);
		
		System.out.println("O tamanho do array " + temperaturas.length);
		
	}

}
