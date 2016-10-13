package es.upm.miw.pd.visitor.figure.solution;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FiguresManagerTest {
	private FiguresManager figuresManager;
	private AreaVisitor areaVisitor;
	private NumberOfSidesVisitor numberOfSidesVisitor;

	@Before
	public void ini() {
		this.figuresManager = new FiguresManager();
		this.figuresManager.add(new Circle("Circle1", 0.21));
		this.figuresManager.add(new Circle("Circle2", 0.43));
		this.figuresManager.add(new Square("Square1", 2.73));
		this.figuresManager.add(new Square("Square2", 4.32));
		this.figuresManager.add(new Triangle("Triangle1", 1.24, 2.68));
		this.figuresManager.add(new Triangle("Triangle2", 3.89, 5.12));
		this.areaVisitor = new AreaVisitor();
		this.numberOfSidesVisitor = new NumberOfSidesVisitor();
	}

	@Test
	public void testTotalArea() {
		assertEquals(38.45, this.figuresManager.totalArea(this.areaVisitor), 10e-2);
	}

	@Test
	public void testTotalNumberOfSides() {
		assertEquals(Double.POSITIVE_INFINITY, this.figuresManager.totalNumberOfSides(this.numberOfSidesVisitor),
				10e-2);
	}

}
