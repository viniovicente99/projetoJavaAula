package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String name;		
	    Scanner input = new Scanner(System.in);
	    
	    for(int i = 1; i < 4; i++) {
	    	System.out.printf("\nDigite o %d° nome: ", i);
	    	
	    	name = input.nextLine();
	 	    System.out.printf("\nO %d° nome é: %s\n", i, name);   	
	    }       
	}
}
