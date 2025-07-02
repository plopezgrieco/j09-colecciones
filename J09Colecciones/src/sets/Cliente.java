package sets;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Cliente implements Comparable<Cliente> {

	private int idCliente;
	private String apellido1;
	private String apellido2;
	private String nombre;
	private String email;
	
	public Cliente() {
	}

	public Cliente(int idCliente, String apellido1, String apellido2, String nombre, String email) {
		this.idCliente = idCliente;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.email = email;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return idCliente;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return idCliente == other.idCliente;
	}

	@Override
	public String toString() {
		return "Cliente (" + idCliente + ", " + apellido1 + ", " + apellido2 + ", " + nombre + ", " + email + ")";
	}
	
	@Override
	public int compareTo(Cliente o) {
		return this.idCliente - o.idCliente;
	}

	public static Comparator<Cliente> getComparatorApellidos(){
		return new Comparator<Cliente>() {
			public int compare(Cliente c1, Cliente c2) {
				String nombre1 = c1.getApellido1() + c1.getApellido2() + c1.getNombre() + c1.getIdCliente();
				String nombre2 = c2.getApellido1() + c2.getApellido2() + c2.getNombre() + c2.getIdCliente();
				Collator col = Collator.getInstance(new Locale.Builder().setLanguage("es").build());
				return  col.compare(nombre1, nombre2);
			}
		};
	}
}
