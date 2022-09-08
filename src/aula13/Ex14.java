package aula13;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo: ");
		double tamArquivo = entrada.nextDouble();
		
		System.out.println("Entre com a velocidade da Internet:");
		double velInternet = entrada.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		System.out.println("Tempo de download: " + tempo);
	}

}
