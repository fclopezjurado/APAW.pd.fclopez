package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {
	private List<Figure> figures;

	public FiguresManager() {
		figures = new ArrayList<>();
	}

	public void add(Figure figure) {
		figures.add(figure);
	}

	public double totalArea(Visitor visitor) {
		double result = 0;
		for (Figure figure : figures) {
			result += figure.area(visitor);
		}
		return result;
	}

	public double totalNumberOfSides(Visitor visitor) {
		double result = 0;
		for (Figure figure : figures) {
			result += figure.numberOfSides(visitor);
		}
		return result;
	}

}
