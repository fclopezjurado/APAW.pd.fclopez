package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class SubtractCommand extends GenericCommand {
	private static String RESTA = "RESTA";

	public SubtractCommand(AbstractCalculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		int number = IO.getIO().readInt();
		this.getCalculator().subtract(number);
	}

	@Override
	public String name() {
		return SubtractCommand.RESTA;
	}

}
