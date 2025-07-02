package sets;

import java.util.HashSet;
import java.util.Set;

public class SetHashCliente {
	public static void main(String[] args) {
		Set<Cliente> clientes = new HashSet<Cliente>();
		
		clientes.add(new Cliente(75, "Fernandez", "Jimenez", "Maria","@1"));
		clientes.add(new Cliente(14, "Rodriguez", "Sanchez", "Jose","@2"));
		clientes.add(new Cliente(5, "Lopez", "Lopez", "Fernando","@3"));
		clientes.add(new Cliente(289, "Altamira", "Jimenez", "Maria","@4"));
		clientes.add(new Cliente(18, "Rodriguez", "Rodriguez", "Juan","@5"));
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
}
