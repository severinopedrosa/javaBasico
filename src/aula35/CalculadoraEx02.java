package aula35;

public class CalculadoraEx02 {
	
	public static int somatorio(int num) {
		if (num == 1) {
			return 1;
		}
		return num + somatorio (num-1);
	}
}