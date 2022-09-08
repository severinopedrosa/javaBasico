package aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com sua idade");
		
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("Não é maior de idade.");
		}
		
		System.out.println("Entre com o preço do item");
		double valor = entrada.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Está barato, pode comprar");
		} else if (valor > 10 && valor < 15){
			System.out.println("Você pode pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		} else {
			System.out.println("Muito caro!");
		}
	}

}
