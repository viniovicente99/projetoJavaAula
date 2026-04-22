package lacoCondicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		int age;
		
		System.out.println("Digite sua idade: ");
		age = input.nextInt();
		
		if(age < 18) {
			System.out.println("Você não pode dirigir");
		}
	};

}
