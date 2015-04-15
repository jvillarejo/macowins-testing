package utn.frba.disenio.macowinstesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MarcaTest {
	
	private Sarkany sarkany;
	private Armani armani;

	@Before
	public void setUp() throws Exception {
		sarkany = new Sarkany();
		armani = new Armani();
	}

	@Test
	public void coeficienteArmaniEs1_65() {
		assertEquals( (Double) 1.65, armani.coeficiente(500.0));
		
	}
	
	@Test
	public void coeficienteSarkanyConPrecioMayorOIgualA500()  {
		assertEquals((Double) 1.35, sarkany.coeficiente(600.0) );
	}
	
	@Test
	public void coeficienteSarkanyConPrecioMenorA500() {
		assertEquals((Double) 1.10, sarkany.coeficiente(300.0));
	}
	
}
