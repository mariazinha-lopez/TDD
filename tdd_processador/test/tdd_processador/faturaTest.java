package tdd_processador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class faturaTest {


	@Test
	public void testCriaFatura() {
		Fatura f = new Fatura("2020-01-22", 200.50, "Wladimir Tourinho", "NÃO PAGO");
		Assertions.assertEquals(200.50, f.getValorTotal());
	}
}
