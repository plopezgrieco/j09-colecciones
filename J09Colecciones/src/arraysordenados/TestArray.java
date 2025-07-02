package arraysordenados;

import java.util.Arrays;

import sets.Cliente;

public class TestArray {
	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[7];
		clientes[0] = (new Cliente(75, "Fernandez", "Jimenez", "Maria","@1"));
		clientes[1] = (new Cliente(14, "Rodriguez", "Sanchez", "Jose","@2"));
		clientes[2] = (new Cliente(5, "lopez", "Lopez", "Fernando","@3"));
		clientes[3] = (new Cliente(289, "Altamira", "Jimenez", "Maria","@4"));
		clientes[4] = (new Cliente(537, "altamira", "Fernandez", "Jorge","@6"));
		clientes[5] = (new Cliente(18, "Rodriguez", "Rodriguez", "Juan","@5"));
		clientes[6] = (new Cliente(4, "Ávila", "", "Pedro","@7"));

		muestra(clientes);
		
		Arrays.sort(clientes);
		System.out.println("-----------");
		muestra(clientes);
		
		Arrays.sort(clientes, Cliente.getComparatorApellidos());
		System.out.println("-----------");
		muestra(clientes);
	}
	
	public static void muestra(Cliente[] clis) {
		for (Cliente cliente : clis) {
			System.out.println(cliente);
		}
	}
}
