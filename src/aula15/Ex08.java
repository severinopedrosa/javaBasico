package aula15;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro pre�o:");
		double preco1 = entrada.nextInt();
		
		System.out.println("Digite o segundo pre�o:");
		double preco2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro pre�o:");
		double preco3 = entrada.nextInt();
		
//		if(preco1 > preco2 && preco1 > preco3) {
//			System.out.println("preco1 � maior: " + preco1);
//		}else if(preco2 > preco1 && preco2 > preco3) {
//			System.out.println("preco2 � maior: " + preco2);
//		} else if(preco3 > preco1 && preco3 > preco2) {
//			System.out.println("num3 � maior: " + preco3);
//		}
		
		if(preco1 < preco3 && preco1 < preco2) {
			System.out.println("Compre produto 1");
		}else if(preco2 < preco1 && preco2 < preco3) {
			System.out.println("Compre produto 2");
		} else if(preco3 < preco1 && preco3 < preco2) {
			System.out.println("Compre produto 3");
		}
	}

}
