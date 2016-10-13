package es.upm.miw.pd.visitor.figure.solution;

public class Triangle extends Figure {
	private double base;
	private double height;

	public Triangle(String description, double base, double height) {
		super(description);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return this.base;
	}

	public double getHeight() {
		return this.height;
	}

	@Override
	public double area(Visitor visitor) {
		return visitor.visitTriangle(this);
	}

	@Override
	public double numberOfSides(Visitor visitor) {
		return visitor.visitTriangle(this);
	}

}
