package es.upm.miw.pd.command.memento.calculator;

import es.upm.miw.pd.command.calculator.solution.AbstractCalculator;

public class MementoCalculator extends AbstractCalculator {

	public MementoCalculator() {
		super();
	}

	public Memento storeMemento() {
		return new Memento(this.getTotal());
	}

	public void restoreMemento(Memento memento) {
		this.setTotal(memento.getTotal());
	}

}
