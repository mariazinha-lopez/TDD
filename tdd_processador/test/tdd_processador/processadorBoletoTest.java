package tdd_processador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class processadorBoletoTest {

	private Boleto boleto;
	private Boleto boleto2;
	private Boleto boleto3;
	private Fatura fatura;
	private Pagamento pagamento;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto ("23423423", "2020-01-23", 200.50);
		boleto2 = new Boleto ("23234467", "2019-05-19", 2220.50);
		boleto3 = new Boleto ("56732235", "2021-01-03", 500);
		fatura = new Fatura ("2020-01-22", 200.50, "Wladimir Tourinho", "NÃO PAGO");
		fatura.adicionarBoleto(boleto);
		fatura.adicionarBoleto(boleto2);
		fatura.adicionarBoleto(boleto3);
	}	

	
	@Test
	public void testRecebeFatura() {
		ProcessadorBoleto pb = new ProcessadorBoleto();
		Assertions.assertEquals(200.50, pb.SalvaFatura(fatura));
	}
	
	@Test
	public void testCriaPagamento() {
		ProcessadorBoleto pb = new ProcessadorBoleto();
		pagamento = pb.CriaPagamento(boleto,"2020-09-30","BOLETO");
		Assertions.assertEquals(200.50, pagamento.valPago());
		
	}
	
	@Test
	public void testSomaBoleto() {
		ProcessadorBoleto pb = new ProcessadorBoleto();
		pb.SomaBoletos(fatura);
	}
}
