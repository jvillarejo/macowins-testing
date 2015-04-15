package utn.frba.disenio.macowinstesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PrendaTest {
		
	private Camisa camisaNacional;
	private Marca marca; 
	
	@Before
	public void setUp() {
		marca  = mock(Marca.class);
		
		camisaNacional = new Camisa(false, marca);
	}
	
	@Test
	public void precioFinalDeUnaCamisaDaValorCorrecto() throws Exception {
		when(marca.coeficiente(anyDouble()) ).thenReturn(1.0);
		
		assertEquals( (Double) 250.0, camisaNacional.precioFinal());
		
		verify(marca, times(1)).coeficiente(anyDouble());
	}
}
