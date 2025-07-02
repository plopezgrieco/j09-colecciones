package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lista02Recorrido {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		long t0, tf;
		
		int cant = 200_000;
		cargaLista(al, cant);
		cargaLista(ll, cant);
		
		//Recorre accediendo a cada elemento por posición
		//Despedir al que lo hizo
		t0 = System.currentTimeMillis();
		recorre(al);
		tf = System.currentTimeMillis();
		System.err.println("ArrayList: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
//		recorre(ll);
		tf = System.currentTimeMillis();
		System.err.println("LinkedList: " + (tf-t0));
		
		//Recorre con iterator()
		t0 = System.currentTimeMillis();
		recorreIterator(al);
		tf = System.currentTimeMillis();
		System.err.println("ArrayList con Iterator: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		recorreIterator(ll);
		tf = System.currentTimeMillis();
		System.err.println("LinkedList con Iterator: " + (tf-t0));
		
		//Recorre con ForEach
		t0 = System.currentTimeMillis();
		recorreForEach(al);
		tf = System.currentTimeMillis();
		System.err.println("ArrayList con ForEach: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		recorreForEach(ll);
		tf = System.currentTimeMillis();
		System.err.println("LinkedList con ForEach: " + (tf-t0));
		
	}
	
	public static void recorre(List<String> lista) {
		String str;
		for (int i = 0; i < lista.size(); i++) {
			str = lista.get(i);
		}
	}
	
	public static void recorreIterator(List<String> lista) {
		String str;
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			str = it.next();
//			System.out.println(str);
		}
	}
	
	public static void recorreForEach(List<String> lista) {
		for(String str : lista) {
//			System.out.println(str);
		}
	}
	
	public static void cargaLista(List<String> lista, int cant) {
		for (int i = 1; i <= cant; i++) {
			lista.add("hola");
		}
	}
}
