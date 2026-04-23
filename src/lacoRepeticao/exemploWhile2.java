package lacoRepeticao;

import java.util.Scanner;

public class exemploWhile2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number1, number2, sum, resume = 1;
		
		while(resume != 0) {
			
			System.out.println("Digite primeiro valor: ");
	        number1 = input.nextInt();

	        System.out.println("Digite segundo valor: ");
	        number2 = input.nextInt();

	        sum = number1 + number2;

	        System.out.println("O resultado da soma é: " + sum);
	        
	        System.out.println("Deseja continuar? Digite um número diferente de 0");
	        resume = input.nextInt();
	        
		}		

	}

}
