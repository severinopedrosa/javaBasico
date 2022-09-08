package aula15;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		int num1 = entrada.nextInt();
		
		System.out.println("Entre com o primeiro numero:");
		int num2 = entrada.nextInt();
		
		System.out.println("Entre com a operação (+ - / *):");
		String operacao = entrada.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
			default: System.out.println("Operação inválida");
			valida = false;
		}
		
		System.out.println("Resultado: " + resultado);
		if (resultado  >= 0){
			System.out.println("resultado positivo");
		} else {
			System.out.println("resultado negativo");
			if(resultado % 2 == 0) {
				System.out.println("resultado par");
				
			}else {
				System.out.println("resultado ímpar");
			}
		}
	}

}
