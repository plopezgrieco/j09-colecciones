package sets;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ClienteComparatorApellido implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		String nombre1 = c1.getApellido1() + c1.getApellido2() + c1.getNombre() + c1.getIdCliente();
		String nombre2 = c2.getApellido1() + c2.getApellido2() + c2.getNombre() + c2.getIdCliente();
//		Collator col = Collator.getInstance(new Locale("es", "ESP")); //deprecated a partir de v19
		Collator col = Collator.getInstance(new Locale.Builder().setLanguage("es").build());
		
		return  col.compare(nombre1, nombre2);
	}

}
