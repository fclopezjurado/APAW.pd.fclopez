package es.upm.miw.pd.text.solution;

public abstract class Componente {

	public Componente() {

	}

	public abstract boolean remove(Componente componente);

	public abstract void add(Componente componente);

	public abstract boolean esCompuesto();

	public abstract String dibujar(boolean enMayusculas);

}
