package es.upm.miw.pd.visitor.figure.solution;

public abstract class Figure implements Element {
	private String description;

	public Figure(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public abstract double area(Visitor visitor);

	public abstract double numberOfSides(Visitor visitor);

}
