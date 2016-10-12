package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberEn extends NaturalNumber {
	private static final String[] textValue = { "zero", "one", "two", "three", "four", "five" };

	public NaturalNumberEn(int value) {
		super(value);
	}

	@Override
	public String getTextValue() {
		if (this.getValue() < textValue.length) {
			return NaturalNumberEn.textValue[this.getValue()];
		} else {
			return "???";
		}
	}

}
