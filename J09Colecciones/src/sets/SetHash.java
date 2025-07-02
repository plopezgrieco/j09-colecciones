package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetHash {
	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<>(100);
		
		System.out.println("primero".hashCode());
		
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
		System.out.println(hs.add("ultimos"));
		System.out.println(hs.add("ultimos"));
		System.out.println(hs.add("ultimos"));
		
		for (String str : hs) {
			System.out.println(str);
		}
	}
}
