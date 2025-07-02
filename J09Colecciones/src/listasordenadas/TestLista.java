package listasordenadas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import sets.Cliente;

public class TestLista {
	public static void main(String[] args) {
		List<Cliente> clientes = new LinkedList<Cliente>();
		
		clientes.add(new Cliente(75, "Fernandez", "Jimenez", "Maria","@1"));
		clientes.add(new Cliente(14, "Rodriguez", "Sanchez", "Jose","@2"));
		clientes.add(new Cliente(5, "lopez", "Lopez", "Fernando","@3"));
		clientes.add(new Cliente(289, "Altamira", "Jimenez", "Maria","@4"));
		clientes.add(new Cliente(537, "altamira", "Fernandez", "Jorge","@6"));
		clientes.add(new Cliente(18, "Rodriguez", "Rodriguez", "Juan","@5"));
		clientes.add(new Cliente(4, "Ávila", "", "Pedro","@7"));

		clientes.forEach(System.out::println);
		
		Collections.sort(clientes);
		System.out.println("----");
		clientes.forEach(System.out::println);
		
		Collections.sort(clientes, Cliente.getComparatorApellidos());
		System.out.println("----");
		clientes.forEach(System.out::println);
	}
}
