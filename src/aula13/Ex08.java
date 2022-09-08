package aula13;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora");
		double valorHora = entrada.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mês: ");
		double horas = entrada.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salário é de: " + salario);
	}

}
