package es.upm.miw.pd.composite.expression.solution;

public abstract class Operacion extends Expresion {
	private Expresion operando1;
	private Expresion operando2;

	public Operacion(Expresion operando1, Expresion operando2) {
		this.setOperando1(operando1);
		this.setOperando2(operando2);
	}

	public Expresion getOperando1() {
		return operando1;
	}

	private void setOperando1(Expresion operando1) {
		this.operando1 = operando1;
	}

	public Expresion getOperando2() {
		return operando2;
	}

	private void setOperando2(Expresion operando2) {
		this.operando2 = operando2;
	}

}
