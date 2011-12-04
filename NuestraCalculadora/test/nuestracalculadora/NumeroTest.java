package nuestracalculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumeroTest {

	@Test
	public void deberiaCrearNumeroYObtenerValor() {
		Numero num = new Numero(10.0);

		double resultado = num.getValor();
		assertEquals(10.0, resultado, 0);

	}

}
