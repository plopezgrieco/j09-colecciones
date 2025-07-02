package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista01 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		
		al.add("primero");
		al.add("segundo");
		al.add("tercero");
		al.add("cuarto");
		al.add("quinto");
		List<String> ll = new LinkedList<>(al);
		
		System.out.println(al.get(2));
		
		recorre(al);
		System.out.println("-----");
		recorre(ll);
		
	}
	
	public static void recorre(List<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
