package lacoRepeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		 int num, result, counter = 3;
	     Scanner input = new Scanner(System.in);
	     
	     do {
	    	 
	     System.out.println("\nDigite um número inteiro: ");
         num = input.nextInt();
         result = num * 5;
         System.out.println("\nO resultado da multiplicação é: " + result);
         
	     } while (counter <= 2);

	}

}
