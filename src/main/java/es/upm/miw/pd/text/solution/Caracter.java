package es.upm.miw.pd.text.solution;

public class Caracter extends Componente {
	private String caracter;

	public Caracter(String caracter) {
		this.setCaracter(caracter);
	}

	public String getCaracter() {
		return this.caracter;
	}

	public void setCaracter(String caracter) {
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
			return this.getCaracter().toUpperCase();

		return this.getCaracter();
	}

}
