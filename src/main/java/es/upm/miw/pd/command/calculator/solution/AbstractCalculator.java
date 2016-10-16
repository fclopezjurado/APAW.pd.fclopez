package es.upm.miw.pd.command.calculator.solution;

public abstract class AbstractCalculator {
	protected int total;

	public AbstractCalculator() {
		this.reset();
	}

	public int getTotal() {
		return total;
	}

	protected void setTotal(int total) {
		this.total = total;
	}

	public void add(int valor) {
		this.setTotal(this.total + valor);
	}

	public void subtract(int valor) {
		this.setTotal(this.total - valor);
	}

	public void reset() {
		this.setTotal(0);
	}

}
