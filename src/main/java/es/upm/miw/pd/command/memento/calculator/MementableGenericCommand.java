package es.upm.miw.pd.command.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.Command;

public abstract class MementableGenericCommand implements Command {
	private MementoCalculator mementoCalculator;

	public MementableGenericCommand(MementoCalculator calculator) {
		this.mementoCalculator = calculator;
	}

	public MementoCalculator getMementoCalculator() {
		return this.mementoCalculator;
	}

	public abstract void execute();

	public abstract String name();

}
