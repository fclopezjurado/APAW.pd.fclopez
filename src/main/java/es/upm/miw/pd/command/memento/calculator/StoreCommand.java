package es.upm.miw.pd.command.memento.calculator;

import upm.jbb.IO;

public class StoreCommand extends MementableGenericCommand {
	private static String STORE_MEMENTO = "STORE MEMENTO";

	public StoreCommand(MementoCalculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		String mementoName = IO.getIO().readString();
		this.getMementoCalculator().storeMemento(mementoName);
	}

	@Override
	public String name() {
		return StoreCommand.STORE_MEMENTO;
	}

}
