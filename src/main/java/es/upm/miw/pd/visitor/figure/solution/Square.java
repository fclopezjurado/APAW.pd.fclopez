package es.upm.miw.pd.visitor.figure.solution;

public class Square extends Figure {
	private double side;

	public Square(String description, double side) {
		super(description);
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}

	@Override
	public double area(Visitor visitor) {
		return visitor.visitSquare(this);
	}

	@Override
	public double numberOfSides(Visitor visitor) {
		return visitor.visitSquare(this);
	}

}
