package es.upm.miw.pd.visitor.figure.solution;

public class NumberOfSidesVisitor extends Visitor {

	@Override
	public double visitCircle(Circle circle) {
		return Double.POSITIVE_INFINITY;
	}

	@Override
	public double visitSquare(Square square) {
		return 4;
	}

	@Override
	public double visitTriangle(Triangle triangle) {
		return 3;
	}

}
