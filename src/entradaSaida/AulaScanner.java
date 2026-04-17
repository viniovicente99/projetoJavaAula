package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {		

		Scanner input = new Scanner(System.in);
		String name;		

		System.out.println("Digite o seu nome: ");		

		name = input.nextLine();

		System.out.println("Bom dia, " + name + ".");
	}

}