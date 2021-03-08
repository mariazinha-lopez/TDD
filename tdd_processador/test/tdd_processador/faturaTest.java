package tdd_processador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class faturaTest {


	@Test
	public void testCriaFatura() {
		Fatura f = new Fatura("2020-01-22", 200.50, "Wladimir Tourinho", "NÃO PAGO");
		Assertions.assertEquals(200.50, f.getValorTotal());
	}
	
	@Test
	public void testAdicionaBoleto() {
		Boleto boleto = new Boleto ("23423423", "2020-01-23", 200.50);
		Boleto boleto2 = new Boleto ("23234467", "2019-05-19", 2220.50);
		Fatura f = new Fatura("2020-01-22", 200.50, "Wladimir Tourinho", "NÃO PAGO");
		f.adicionarBoleto(boleto);
		f.adicionarBoleto(boleto2);
		Assertions.assertTrue(f.getBoletos().contains(boleto) && f.getBoletos().contains(boleto2));
	}
}
