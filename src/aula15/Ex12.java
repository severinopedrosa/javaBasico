package aula15;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora");
		double valorHora = entrada.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mês: ");
		double horas = entrada.nextDouble();
		
		double salarioBruto = valorHora * horas;
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double desconto = ir + inss;
		double sindicato = (salarioBruto / 100) * 3;
		double salarioLiquido = salarioBruto - desconto;
		
		System.out.println("O salário bruto (" + valorHora + " * " + horas + "): " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%): " + ir);
		System.out.println("(-) INSS: " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total descontos: " + desconto);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Salário líquido: " + salarioLiquido);
	}

}
