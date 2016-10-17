package es.upm.miw.pd.command.memento.calculator;

import upm.jbb.IO;

public class RestoreCommand extends MementableGenericCommand {
	private static String RESTORE_MEMENTO = "RESTORE MEMENTO";

	public RestoreCommand(MementoCalculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		String mementoKey = (String) IO.getIO().select(this.getMementoCalculator().getMementoManager().keys());
		this.getMementoCalculator().restoreMemento(mementoKey);
	}

	@Override
	public String name() {
		return RestoreCommand.RESTORE_MEMENTO;
	}

}
