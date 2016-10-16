package es.upm.miw.pd.command.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.AbstractCalculator;
import es.upm.miw.pd.command.calculator.solution.GenericCommand;
import upm.jbb.IO;

public class StoreCommand extends GenericCommand {
	private static String STORE_MEMENTO = "STORE MEMENTO";
	private MementoManager mementoManager;

	public StoreCommand(AbstractCalculator calculator, MementoManager mementoManager) {
		super(calculator);
		this.mementoManager = mementoManager;
	}

	public MementoManager getMementoManager() {
		return this.mementoManager;
	}

	@Override
	public void execute() {
		String mementoName = IO.getIO().readString();
		this.mementoManager.addMemento(mementoName, new Memento(this.getCalculator().getTotal()));
	}

	@Override
	public String name() {
		return StoreCommand.STORE_MEMENTO;
	}

}
