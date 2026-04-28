package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2, 5);
		
		System.out.println("Primeiro resultado: " + resultado);
		
		mensagem();
		
		saudacao("teste");
		
		ExemploMetodoExterno.info();
		
	}
	
	public static int somar(int num1, int num2) {
		
		return num1 + num2;
		
	}
	
	public static void mensagem() {
		
		System.out.println("Esse metodo não tem retorno (void)");
		
	}
	
	public static void saudacao(String msg) {
		
		System.out.println(msg);
		
	};

}
