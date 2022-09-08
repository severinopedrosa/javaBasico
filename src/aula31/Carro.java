package aula31;

import java.util.Objects;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	

	

	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		
		return this.divideKmPorConsumoCombustivel(km);
	}

}