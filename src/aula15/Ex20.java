package aula15;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Telefonou para a vítima?");
		String resp1 = entrada.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = entrada.next();
		
		System.out.println("Mora perto da vítima?");
		String resp3 = entrada.next();
		
		System.out.println("Já trabalho com a vítima?");
		String resp4 = entrada.next();
		
		System.out.println("Devia para a vítima?");
		String resp5 = entrada.next();
		
		int cont = 0;
		
		if(resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita");
		}else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		} else  if (cont == 5) {
			System.out.println("Assassino");
		}else  if (cont == 0) {
			System.out.println("Inocente");
		}
		entrada.close();
	}

}
