package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberManager {
	private NaturalNumber naturalNumber;

	private NaturalNumberCreator naturalNumberCreator;

	public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
		this.naturalNumberCreator = naturalNumberCreator;
	}

	public void createNaturalNumber(int value) {
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(value);
	}

	public NaturalNumber getNaturalNumber() {
		return this.naturalNumber;
	}

}
