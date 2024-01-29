package ficheros;

import java.util.ArrayList;
import java.util.List;

public class DaoArticulos {
	
	List<Articulos> listaArticulos;
	
	public DaoArticulos () {
		super();
		listaArticulos = new ArrayList<Articulos>();
	}
	
	public Articulos añadirArticulos (Articulos a) {
		
		int cont = 0;
		if(listaArticulos.contains(a)) {
			System.out.println("Añadir Artículo a la lista");
			return null;
		}
		else {
			listaArticulos.add(a);
			cont = listaArticulos.size()-1;
			System.out.println("Artículo añadido");
			return listaArticulos.get(cont);
		}
		
	}
	
	public Articulos borrarArticulos (String id) {
		
		boolean auxArticuloEncontrado = false;
		
		for(Articulos a : listaArticulos) {
			if(a.getId().equals(id)) {
				int aux = listaArticulos.indexOf(a);
				System.out.println("Borrar " + a + "");
				auxArticuloEncontrado = true; 
				return listaArticulos.remove(aux);
				
			}
			
		}
		if (!auxArticuloEncontrado)
			System.out.println("Borrar: El Artículo no se encuentra en la lista");
		
		return null;
		
	}
	
	public Articulos buscarArticulo (String id) {
		boolean auxArticuloEncontrado = false;
		
		for(Articulos a : listaArticulos) {
			if(a.getId().equals(id)) {
				System.out.println(a);
				auxArticuloEncontrado = true;
			}
		}
		if(!auxArticuloEncontrado)
			System.out.println("Buscar: El atriculo buscado no se encuentra en la lista");
		return null;
	}

}
