package aula13;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora");
		double valorHora = entrada.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mês: ");
		double horas = entrada.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O salário é de: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
		
		
		
	}

}
