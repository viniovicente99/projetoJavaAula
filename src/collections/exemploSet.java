package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exemploSet {

	public static void main(String[] args) {

		Set<String> setFrutas = new HashSet<String>();

		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		System.out.println("\nDados da Collection: " + setFrutas);

		// Lista todos os elementos da Collection Set com o Objeto da Classe Iterator
		System.out.println("\n\nListar todos os Elementos com o Iterator");

		Iterator<String> isetFrutas = setFrutas.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
		}

	}

}
