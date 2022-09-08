package aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.1");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.2");
		
		return capCombustivel * consumoCombustivel;
	}

}
