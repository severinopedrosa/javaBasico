package aula15;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		
		System.out.println("Entre com total de litros vendidos:");
		double litros = entrada.nextDouble();
		
		System.out.println("Qual tipo de combustivel?");
		String tipo = entrada.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int desconto = 0;
		double totalDesconto = 0;
		double total = 0;
		
		if (tipo.equalsIgnoreCase("a") ) {
			if (litros <= 20) {
				desconto = 3;
			}else {
				desconto = 5;
			}
			
			total = litros * precoAlc;
		} else if (tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				desconto = 4;
			}else {
				desconto = 6;
			}
			
			total = litros * precoGas;
			
		}
		
		totalDesconto = (total / 100) * desconto;
		
		double precoAPagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoAPagar);
		entrada.close();
	}

}
