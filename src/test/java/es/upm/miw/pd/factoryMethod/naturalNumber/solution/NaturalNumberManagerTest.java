package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberManagerTest {
	private NaturalNumberManager naturalNumberManagerForNaturalNumberEs;
	private NaturalNumberManager naturalNumberManagerForNaturalNumberEn;
	private NaturalNumberManager naturalNumberManagerForNaturalNumberFr;
	private NaturalNumberEsCreator naturalNumberEsCreator;
	private NaturalNumberEnCreator naturalNumberEnCreator;
	private NaturalNumberFrCreator naturalNumberFrCreator;

	@Before
	public void init() {
		this.naturalNumberManagerForNaturalNumberEs = new NaturalNumberManager();
		this.naturalNumberManagerForNaturalNumberEn = new NaturalNumberManager();
		this.naturalNumberManagerForNaturalNumberFr = new NaturalNumberManager();
		this.naturalNumberEsCreator = new NaturalNumberEsCreator();
		this.naturalNumberEnCreator = new NaturalNumberEnCreator();
		this.naturalNumberFrCreator = new NaturalNumberFrCreator();
		this.naturalNumberManagerForNaturalNumberEs.setNaturalNumberCreator(naturalNumberEsCreator);
		this.naturalNumberManagerForNaturalNumberEn.setNaturalNumberCreator(naturalNumberEnCreator);
		this.naturalNumberManagerForNaturalNumberFr.setNaturalNumberCreator(naturalNumberFrCreator);
	}

	@Test
	public void testCreacionNaturalNumberEs() {
		this.naturalNumberManagerForNaturalNumberEs.createNaturalNumber(0);
		assertEquals(0, this.naturalNumberManagerForNaturalNumberEs.getNaturalNumber().getValue());
	}

	@Test
	public void testGetTextNaturalNumberEs() {
		this.naturalNumberManagerForNaturalNumberEs.createNaturalNumber(3);
		assertEquals("tres", this.naturalNumberManagerForNaturalNumberEs.getNaturalNumber().getTextValue());
	}

	@Test
	public void testGetTextNaturalNumberEsOutOfRange() {
		this.naturalNumberManagerForNaturalNumberEs.createNaturalNumber(6);
		assertEquals("???", this.naturalNumberManagerForNaturalNumberEs.getNaturalNumber().getTextValue());
	}

	@Test
	public void testAddNaturalNumberEs() {
		this.naturalNumberManagerForNaturalNumberEs.createNaturalNumber(2);
		this.naturalNumberManagerForNaturalNumberEs.getNaturalNumber().add(3);
		assertEquals(5, this.naturalNumberManagerForNaturalNumberEs.getNaturalNumber().getValue());
	}

	@Test
	public void testCreacionNaturalNumberEn() {
		this.naturalNumberManagerForNaturalNumberEn.createNaturalNumber(0);
		assertEquals(0, this.naturalNumberManagerForNaturalNumberEn.getNaturalNumber().getValue());
	}

	@Test
	public void testGetTextNaturalNumberEn() {
		this.naturalNumberManagerForNaturalNumberEn.createNaturalNumber(3);
		assertEquals("three", this.naturalNumberManagerForNaturalNumberEn.getNaturalNumber().getTextValue());
	}

	@Test
	public void testGetTextNaturalNumberEnOutOfRange() {
		this.naturalNumberManagerForNaturalNumberEn.createNaturalNumber(6);
		assertEquals("???", this.naturalNumberManagerForNaturalNumberEn.getNaturalNumber().getTextValue());
	}

	@Test
	public void testAddNaturalNumberEn() {
		this.naturalNumberManagerForNaturalNumberEn.createNaturalNumber(2);
		this.naturalNumberManagerForNaturalNumberEn.getNaturalNumber().add(3);
		assertEquals(5, this.naturalNumberManagerForNaturalNumberEn.getNaturalNumber().getValue());
	}

	@Test
	public void testCreacionNaturalNumberFr() {
		this.naturalNumberManagerForNaturalNumberFr.createNaturalNumber(0);
		assertEquals(0, this.naturalNumberManagerForNaturalNumberFr.getNaturalNumber().getValue());
	}

	@Test
	public void testGetTextNaturalNumberFr() {
		this.naturalNumberManagerForNaturalNumberFr.createNaturalNumber(3);
		assertEquals("trois", this.naturalNumberManagerForNaturalNumberFr.getNaturalNumber().getTextValue());
	}

	@Test
	public void testGetTextNaturalNumberFrOutOfRange() {
		this.naturalNumberManagerForNaturalNumberFr.createNaturalNumber(6);
		assertEquals("???", this.naturalNumberManagerForNaturalNumberFr.getNaturalNumber().getTextValue());
	}

	@Test
	public void testAddNaturalNumberFr() {
		this.naturalNumberManagerForNaturalNumberFr.createNaturalNumber(2);
		this.naturalNumberManagerForNaturalNumberFr.getNaturalNumber().add(3);
		assertEquals(5, this.naturalNumberManagerForNaturalNumberFr.getNaturalNumber().getValue());
	}

}
