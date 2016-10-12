package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberManager {
	private NaturalNumber naturalNumber;

	private NaturalNumberCreator naturalNumberCreator;

	public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
		this.naturalNumberCreator = naturalNumberCreator;
	}

	public void createNaturalNumber() {
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber();
	}

	public NaturalNumber getNaturalNumber() {
		return this.naturalNumber;
	}

}
