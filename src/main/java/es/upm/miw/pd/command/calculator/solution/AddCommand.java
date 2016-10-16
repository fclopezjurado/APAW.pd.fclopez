package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class AddCommand extends GenericCommand {
	private static String SUMA = "SUMA";

	public AddCommand(AbstractCalculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		int number = IO.getIO().readInt();
        this.getCalculator().add(number);
	}

	@Override
	public String name() {
		return AddCommand.SUMA;
	}

}
