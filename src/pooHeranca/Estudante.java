package pooHeranca;

public class Estudante {
	
	private String nome;
    private int idade;
    private String email;
    private String matricula;
    private String curso;
    
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}