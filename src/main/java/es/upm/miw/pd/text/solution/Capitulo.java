package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Capitulo extends Componente {
	protected List<Componente> listaComponentes;

	public Capitulo() {
		this.listaComponentes = new ArrayList<Componente>();
	}

	public abstract boolean remove(Componente componente);

	public abstract void add(Componente componente);

	public abstract boolean esCompuesto();

	public abstract String dibujar(boolean enMayusculas);

}
