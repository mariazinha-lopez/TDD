package tdd_processador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class processadorBoletoTest {

	private Boleto boleto;
	private Fatura fatura;
	private Pagamento pagamento;
	
	@BeforeEach
	public void inicializa() {
		boleto = new Boleto ("23423423", "2020-01-23", 200.50);
		fatura = new Fatura ("2020-01-22", 200.50, "Wladimir Tourinho", "NÃO PAGO");
		fatura.adicionarBoleto(boleto);
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
		Assertions.assertEquals(201.50, pagamento.valPago());
		
	}
}
