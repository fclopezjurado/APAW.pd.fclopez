package es.upm.miw.pd.command.calculator.solution;

public class ResetCommand extends GenericCommand {
	private static String RESET = "RESET";

	public ResetCommand(AbstractCalculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		this.getCalculator().reset();
	}

	@Override
	public String name() {
		return ResetCommand.RESET;
	}

}
