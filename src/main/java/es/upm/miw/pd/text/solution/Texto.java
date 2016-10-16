package es.upm.miw.pd.text.solution;

public class Texto extends Capitulo {

	public Texto() {
		super();
	}

	@Override
	public boolean remove(Componente componente) {
		if (componente.esCompuesto())
			return this.listaComponentes.remove(componente);
		else
			throw new UnsupportedOperationException(Parrafo.UNSUPPORTED_OPERATION_EXCEPTION);
	}

	@Override
	public void add(Componente componente) {
		if (componente.esCompuesto())
			this.listaComponentes.add(componente);
		else
			throw new UnsupportedOperationException(Parrafo.UNSUPPORTED_OPERATION_EXCEPTION);

	}

	@Override
	public boolean esCompuesto() {
		return true;
	}

	@Override
	public String dibujar(boolean enMayusculas) {
		String texto = new String();

		for (Componente componente : this.listaComponentes)
			texto += componente.dibujar(enMayusculas);

		return texto + "---o---\n";
	}

}
