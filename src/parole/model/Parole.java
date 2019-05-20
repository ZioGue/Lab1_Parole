package parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	
	private List <String> lista = new ArrayList();
	
	public Parole() {
		
	}
	
	public void addParola(String p) {
		lista.add(p);
		Collections.sort(lista);
	}
	
	public List<String> getElenco() {
		
		return lista;
	}
	
	
	@Override
	public String toString() {
		return "Parole lista=" + lista + "";
	}

	public void reset() {
		lista.clear();
	}

}
