package aula15;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Telefonou para a v�tima?");
		String resp1 = entrada.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = entrada.next();
		
		System.out.println("Mora perto da v�tima?");
		String resp3 = entrada.next();
		
		System.out.println("J� trabalho com a v�tima?");
		String resp4 = entrada.next();
		
		System.out.println("Devia para a v�tima?");
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
			System.out.println("C�mplice");
		} else  if (cont == 5) {
			System.out.println("Assassino");
		}else  if (cont == 0) {
			System.out.println("Inocente");
		}
		entrada.close();
	}

}
