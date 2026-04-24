package vetor;

import java.util.Scanner;

import java.util.Arrays;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorNumeros[] = new int[3];
		
		for(int indice = 0; indice < 3; indice ++) {
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = leia.nextInt() ;
		}
		
		for(int indice2 = 0; indice2 < 3; indice2++) {
			System.out.printf("\n%d° Número: %d", indice2 + 1, vetorNumeros[indice2]);			
		}
			
		System.out.printf("\nArray completo: %s", Arrays.toString(vetorNumeros));
		System.out.printf("\nTamanho do Array: %s", vetorNumeros.length);

	}

}
