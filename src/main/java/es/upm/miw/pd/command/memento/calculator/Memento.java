package es.upm.miw.pd.command.memento.calculator;

public class Memento {
	private int total;

	public Memento(int total) {
		this.setTotal(total);
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
