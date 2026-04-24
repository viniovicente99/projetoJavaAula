package vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		
		String vetorCachorros[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky", "Corgi" };
		
		for(int counter = 0; counter < vetorCachorros.length; counter++) {
			System.out.printf("\n%d° elemento: %s", counter + 1, vetorCachorros[counter]);
		}

	}

}
