package es.upm.miw.pd.command.calculator.solution;

public abstract class GenericCommand extends AbstractCalculator implements Command {
	private AbstractCalculator calculator;

	public GenericCommand(AbstractCalculator calculator) {
		this.calculator = calculator;
	}

	public AbstractCalculator getCalculator() {
		return this.calculator;
	}

	public abstract void execute();

	public abstract String name();

}
