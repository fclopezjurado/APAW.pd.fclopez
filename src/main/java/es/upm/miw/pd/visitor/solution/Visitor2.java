package es.upm.miw.pd.visitor.solution;

import es.upm.miw.pd.visitor.ElementA;
import es.upm.miw.pd.visitor.ElementB;
import es.upm.miw.pd.visitor.Visitor;

public class Visitor2 extends Visitor {
	private int As;
	private int Bs;

	public Visitor2() {
		this.setAs(0);
		this.setBs(0);
	}

	public int getAs() {
		return As;
	}

	private void setAs(int as) {
		As = as;
	}

	public int getBs() {
		return Bs;
	}

	private void setBs(int bs) {
		Bs = bs;
	}

	@Override
	public void visitElementA(ElementA e) {
		this.setAs(this.getAs() + 1);
	}

	@Override
	public void visitElementB(ElementB e) {
		this.setBs(this.getBs() + 1);
	}

}
