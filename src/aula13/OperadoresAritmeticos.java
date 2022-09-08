package aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = 1 + 2;
		
		System.out.println(resultado);
		
		resultado = resultado + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 5;
		System.out.println(resultado);
		
		resultado = resultado / 6;
		System.out.println(resultado);
		
		resultado = resultado % 2;
		System.out.println(resultado);
		
		resultado++;
		
		System.out.println(resultado++);
		//mesma coisa que
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println(++resultado);
//		mesma coisa que
//		resultado += 1;
//		System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado--);
		System.out.println(--resultado);
	}

}
