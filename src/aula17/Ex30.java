package aula17;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner entrada = new Scanner(System.in);

			System.out.println("Entre com o numero para gerar a tabuada:");
			int num = entrada.nextInt();
			
			boolean invalido = false;
			int numFinal, numInicio;
			
			do {
				System.out.println("Entre com o numero o inicio da tabuada");
				numInicio = entrada.nextInt();
				
				System.out.println("Entre com o numero final da tabuada");
				numFinal = entrada.nextInt();
				
				if(numFinal > numInicio) {
					invalido = false;
				}
				
			} while (invalido);
			
			
				
			
			System.out.println("Tabuada de " + num + ":");
			System.out.println("começar por: " + numInicio );
			System.out.println("terminar em: " + numFinal );
			System.out.println();
			
			for (int i = numInicio; i <= numFinal; i++) {
				System.out.println(num + " x " + i + " = " + (num*i));
				
			}
			entrada.close();
		}
	}


