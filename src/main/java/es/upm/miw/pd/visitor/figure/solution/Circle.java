package es.upm.miw.pd.visitor.figure.solution;

public class Circle extends Figure {
	private double radius;

	public Circle(String description, double radius) {
		super(description);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	@Override
	public double area(Visitor visitor) {
		return visitor.visitCircle(this);
	}

	@Override
	public double numberOfSides(Visitor visitor) {
		return visitor.visitCircle(this);
	}

}
