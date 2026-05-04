package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

		//Pessoa p = new Pessoa("Maria", 18);
		
		TriAtleta t = new TriAtleta("Eliane", 26, 400);
		TriAtleta t2 = new TriAtleta("João", 30, 12);
		
		/*t.setNome("Queren");	

		t2.competicoesConcluidas();
		t2.competicoesConcluidas(8);
		*/

		t.visualizar();

	}

}
