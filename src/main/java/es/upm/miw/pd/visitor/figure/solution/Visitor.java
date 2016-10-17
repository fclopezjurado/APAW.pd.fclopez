package es.upm.miw.pd.visitor.figure.solution;

public abstract class Visitor {

	public abstract double visitCircle(Circle circle);

	public abstract double visitSquare(Square square);

	public abstract double visitTriangle(Triangle triangle);

}
