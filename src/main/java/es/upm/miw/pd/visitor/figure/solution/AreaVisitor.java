package es.upm.miw.pd.visitor.figure.solution;

public class AreaVisitor extends Visitor {

	@Override
	public double visitCircle(Circle circle) {
		return Math.PI * circle.getRadius() * circle.getRadius();
	}

	@Override
	public double visitSquare(Square square) {
		return square.getSide() * square.getSide();
	}

	@Override
	public double visitTriangle(Triangle triangle) {
		return triangle.getBase() * triangle.getHeight() * 0.5;
	}

}
