package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {

		// declaration
		Set hs = new HashSet();

		// ajout elements
		hs.add("Bonjour");
		hs.add(125);
		hs.add(78.5f);
		hs.add("d");
		hs.add("d");

		// parcours
		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
