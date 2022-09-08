package aula15;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		double percentual, salario, novoSalario;
		
		System.out.println("Digite o Salário do funcionário:");
		 salario = entrada.nextDouble();
		
		if(salario <= 280){
			percentual = 20;
			  novoSalario = salario * 1.20;
		} else if (salario >= 280 && salario < 700) {
			percentual = 15;
			 novoSalario = salario * 1.15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
			 novoSalario = salario * 1.10;
		} else {
			percentual = 5;
			 novoSalario = salario * 1.05;
		}
		
		System.out.println("Salário antes do Reajuste: R$ " + salario );
		System.out.println("O percentual de aumento aplicado: " + percentual + "%" );
		System.out.println("O valor do aumento: R$" + (novoSalario - salario));
		System.out.println("Novo salário, após o aumento: R$ " + novoSalario);
	}

}
