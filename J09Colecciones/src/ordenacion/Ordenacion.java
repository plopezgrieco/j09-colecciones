package ordenacion;

import java.util.Comparator;

import sets.Cliente;

public class Ordenacion {
	
	public static <T> void quickSort(T[] v) {
		quickSort(v, 0, v.length-1, null);
	}
	
	public static <T> void quickSort(T[] v, Comparator<T> comp) {
		quickSort(v, 0, v.length-1, comp);
	}
	
	private static <T> void quickSort(T[] v, int izq, int der, Comparator<T> comp) {
		int posPivote = (izq + der) / 2;
		T valPivote = v[posPivote];
		int i = izq;
		int d = der;
		while(i <= d) {
			while(esMenor(v[i], valPivote, comp)) i++;
			while(esMayor(v[d], valPivote, comp)) d--;
				
			if (i <= d) {
				intercambia(v, i, d);
				i++;
				d--;
			}
		}
		if(izq < d) quickSort(v, izq, d, comp);
		if(i < der) quickSort(v, i, der, comp);
	}
	
	public static <T> void intercambia(T[] v, int a, int b) {
		T aux = v[a];
		v[a] = v[b];
		v[b] = aux;
	}
	
	@SuppressWarnings("unchecked")
	private static <T> boolean esMenor(T o1, T o2, Comparator<T> comp) {
		boolean resu;
		if (comp == null) {
			Comparable<T> c1 = (Comparable<T>)o1;
			resu = c1.compareTo(o2) < 0; 
		} else
			resu = comp.compare(o1, o2) < 0;
		return resu;
	}
	
	@SuppressWarnings("unchecked")
	private static <T> boolean esMayor(T o1, T o2, Comparator<T> comp) {
		boolean resu;
		if (comp == null) {
			Comparable<T> c1 = (Comparable<T>)o1;
			resu = c1.compareTo(o2) > 0; 
		} else
			resu = comp.compare(o1, o2) > 0;
		return resu;
	}
	
	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[7];
		
		clientes[0] = new Cliente(75, "Fernandez", "Jimenez", "Maria","@1");
		clientes[1] = new Cliente(14, "Rodriguez", "Sanchez", "Jose","@2");
		clientes[2] = new Cliente(5, "lopez", "Lopez", "Fernando","@3");
		clientes[3] = new Cliente(289, "Altamira", "Jimenez", "Maria","@4");
		clientes[4] = new Cliente(537, "altamira", "Fernandez", "Jorge","@6");
		clientes[5] = new Cliente(18, "Rodriguez", "Rodriguez", "Juan","@5");
		clientes[6] = new Cliente(4, "Ávila", "", "Pedro","@7");

		
		muestra(clientes);
		System.out.println("----");
		
		quickSort(clientes);
		muestra(clientes);
		System.out.println("----");

		quickSort(clientes, Cliente.getComparatorApellidos());
		muestra(clientes);
	}
	
	public static void muestra(Cliente[] clis) {
		for (Cliente cliente : clis) {
			System.out.println(cliente);
		}
	}
	
	
}
