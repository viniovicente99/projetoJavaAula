package poo;

public class TestaCarro {

	public static void main(String[] args) {

		Carro c1 = new Carro("Kombi", 4, 4, "Modelo XYZ");
		Carro c2 = new Carro("Toyota", 2, 4, "Supra");

		// c1.marca = "Kombi";
		// c1.portas = 4;

		/*
		 * c1.setMarca("Kombi"); c1.setPortas(4);
		 * 
		 * c1.locomover();
		 */

		System.out.println("\nMarca: " + c1.getMarca());
		System.out.println("Qtd. portas: " + c1.getPortas());
		System.out.println(c1.parar());

		System.err.println("");

		System.out.println("\nMarca: " + c2.getMarca());
		System.out.println("Qtd. portas: " + c2.getPortas());

	}

}
