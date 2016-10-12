package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion {
	private int valor;

	public Numero(int valor) {
		super();
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public float operar() {
		return this.getValor();
	}

}
