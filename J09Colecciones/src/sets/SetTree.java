package sets;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTree {
	public static void main(String[] args) {
//		Set<String> hs = new TreeSet<>();
//		SortedSet<String> hs = new TreeSet<>();
		Collection<String> hs = new TreeSet<>();
		
		hs.add("primero");
		hs.add("segundo");
		hs.add("t");
		hs.add("c");
		hs.add("qu");
		hs.add("sexto");
		hs.add("7");
		hs.add("8");
		System.out.println(hs.add("nueve"));
		System.out.println(hs.add("decimo"));
		System.out.println(hs.add("SEXO"));
		System.out.println(hs.add("ultimos"));
		System.out.println(hs.add("ultimos"));
		
		
		System.out.println("--------");
		for (String str : hs) {
			System.out.println(str);
		}
	}
}
