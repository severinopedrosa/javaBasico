package aula17;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++ ) {
			System.out.println("i tem o valor de " + i);
		}
		
		for (int i = 5; i > 0; i-- ) {
			System.out.println("i tem o valor de " + i);
		}
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + " ; j = " + j);
			
		}
		
		int cont = 0;
		for(; cont < 10; ) {
			System.out.println("valor de cont: " + cont);
			cont += 2;
		}
		
		for (int count = 0; count < 10; count +=2) {
			System.out.println("valor de count: " + count);
		}
		
		int soma = 0;
		for(int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma é " + soma);
		
	
	}

}
