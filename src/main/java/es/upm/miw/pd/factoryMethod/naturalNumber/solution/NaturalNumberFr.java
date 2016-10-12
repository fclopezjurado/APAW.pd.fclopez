package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberFr extends NaturalNumber {
	private static final String[] textValue = { "zero", "un", "deux", "trois", "quatre", "cinq" };

	public NaturalNumberFr(int value) {
		super(value);
	}

	@Override
	public String getTextValue() {
		if (this.getValue() < textValue.length) {
			return NaturalNumberFr.textValue[this.getValue()];
		} else {
			return "???";
		}
	}

}
