package poo;

public class Carro {
	
	private String marca;
	private int rodas;
	private int portas;
	private String modelo_motor;
	
	public Carro(String marca, int rodas, int portas, String modelo_motor) {
		this.marca = marca;
		this.rodas = rodas;
		this.portas = portas;
		this.modelo_motor = modelo_motor;		
	}
	
	public String getMarca() {
		return marca;
	}
		
	public int getRodas() {
		return rodas;
	}

	public int getPortas() {
		return portas;
	}

	public String getModelo_motor() {
		return modelo_motor;
	}

	public void locomover() {
		System.out.println("Estou me locomovendo...");
	}
	
	public String parar() {
		return "Estou parando";
	}

}
