package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista {

	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}
	
	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}
	
	public void competicoesConcluidas() {
		System.out.println("Competições concluídas: " + this.competicoes);
	}
	
	public void competicoesConcluidas(int numero) {
		System.err.println("Competições concluídas: " + numero);
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}
	
	public void pedalar() {
		System.out.println("Estou pedalando...");
	}
	
	@Override
	public String aquecer() {
		return "Estou aquecendo...";
	}
}
