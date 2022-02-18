package problema2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaTest {
	
	Factura f1 = new Factura("1234","Prueba",5,100);
	
	@Test
	void precioTotal() {
		assertEquals(500,f1.getTotalFatura());
	}
	
	@Test
	void validarPrecioNegativa() {
		Factura f2 = new Factura("1234","Prueba",5,-100);
		assertEquals(0,f2.getTotalFatura());
	}

}
