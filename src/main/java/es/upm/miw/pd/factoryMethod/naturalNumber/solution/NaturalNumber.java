package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public abstract class NaturalNumber {
	private int value;

	public NaturalNumber(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public abstract String getTextValue();

}
