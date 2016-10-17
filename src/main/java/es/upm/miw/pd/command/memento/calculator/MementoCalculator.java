package es.upm.miw.pd.command.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.AbstractCalculator;

public class MementoCalculator extends AbstractCalculator {
	private MementoManager<Memento> mementoManager;

	public MementoCalculator() {
		super();
		this.mementoManager = new MementoManager<Memento>();
	}

	public MementoManager<Memento> getMementoManager() {
		return this.mementoManager;
	}

	public void storeMemento(String mementoKey) {
		this.mementoManager.addMemento(mementoKey, new Memento(this.getTotal()));
	}

	public void restoreMemento(String mementoKey) {
		this.setTotal(this.mementoManager.getMemento(mementoKey).getTotal());
	}

}
