package sets;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeCliente {
	public static void main(String[] args) {
		Set<Cliente> clientes = new TreeSet<Cliente>();
		
		clientes.add(new Cliente(75, "Fernandez", "Jimenez", "Maria","@1"));
		clientes.add(new Cliente(14, "Rodriguez", "Sanchez", "Jose","@2"));
		clientes.add(new Cliente(5, "lopez", "Lopez", "Fernando","@3"));
		clientes.add(new Cliente(289, "Altamira", "Jimenez", "Maria","@4"));
		clientes.add(new Cliente(537, "altamira", "Fernandez", "Jorge","@6"));
		clientes.add(new Cliente(18, "Rodriguez", "Rodriguez", "Juan","@5"));
		clientes.add(new Cliente(4, "Ávila", "", "Pedro","@7"));
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
		System.out.println("------------------------------");
		
		//Opcion 1 - no se utiliza
		//Creando una clase que implemente Comparator y pasarle un objeto anónimo de esa clase
//		Set<Cliente> clientesApellido = new TreeSet<Cliente>(new ClienteComparatorApellido());
		
		//Opcion 2
		// Cuando no volveré a utilizar ese criterio
		// Creando un objeto anómimo de una clase anónima que implemente Comparator
//		Set<Cliente> clientesApellido = new TreeSet<Cliente>(new Comparator<Cliente>() {
//			public int compare(Cliente c1, Cliente c2) {
//				String nombre1 = c1.getApellido1() + c1.getApellido2() + c1.getNombre() + c1.getIdCliente();
//				String nombre2 = c2.getApellido1() + c2.getApellido2() + c2.getNombre() + c2.getIdCliente();
//				Collator col = Collator.getInstance(new Locale.Builder().setLanguage("es").build());
//				return  col.compare(nombre1, nombre2);
//			}
//		});
		
		
		//Opcion 3
		//Pidiendo el objeto Comparator a un método estático de Cliente
		Set<Cliente> clientesApellido = new TreeSet<Cliente>(Cliente.getComparatorApellidos());
		
		clientesApellido.addAll(clientes);
		
		for (Cliente cliente : clientesApellido) {
			System.out.println(cliente);
		}
	}
}
