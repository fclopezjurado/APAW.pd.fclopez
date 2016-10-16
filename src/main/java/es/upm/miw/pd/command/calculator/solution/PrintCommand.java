package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class PrintCommand extends GenericCommand {
	private static String PRINT = "PRINT";

	public PrintCommand(AbstractCalculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		int total = this.getCalculator().getTotal();
		IO.getIO().println(total);
	}

	@Override
	public String name() {
		return PrintCommand.PRINT;
	}

}
