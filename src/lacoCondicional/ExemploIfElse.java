package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		
		float grade1, grade2, avg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		grade1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		grade2 = input.nextFloat();
		
		avg = (grade1 + grade2) / 2;
		
		if(avg >= 6) {
			System.out.println("Parabéns, pessoa aprovada!");
		} else {
			System.out.println("Infelizmente, pessoa reprovada.");			
		};
		
	
	}

}
