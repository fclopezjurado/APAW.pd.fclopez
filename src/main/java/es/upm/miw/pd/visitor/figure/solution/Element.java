package es.upm.miw.pd.visitor.figure.solution;

public interface Element {
	public double area(Visitor visitor);

	public double numberOfSides(Visitor visitor);
}
