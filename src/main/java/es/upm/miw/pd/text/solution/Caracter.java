package es.upm.miw.pd.text.solution;

public class Caracter extends Componente {
	private char caracter;

	public Caracter(char caracter) {
		this.setCaracter(caracter);
	}

	public char getCaracter() {
		return this.caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	@Override
	public boolean remove(Componente componente) {
		return true;
	}

	@Override
	public void add(Componente componente) {
	}

	@Override
	public boolean esCompuesto() {
		return false;
	}

	@Override
	public String dibujar(boolean enMayusculas) {
		if (enMayusculas)
			return String.valueOf(Character.toUpperCase(this.getCaracter()));

		return String.valueOf(this.getCaracter());
	}

}
