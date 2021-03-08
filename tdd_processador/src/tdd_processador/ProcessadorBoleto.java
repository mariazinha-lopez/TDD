package tdd_processador;

public class ProcessadorBoleto{
	
	public double SalvaFatura(Fatura f) {
		return f.getValorTotal();
	}
	
	public Pagamento CriaPagamento(Boleto b, String data, String tipoPagamento) {
		Pagamento p = new Pagamento(b.getValPago(),data,tipoPagamento);
		return p;
	}
	
	public double SomaBoletos(Fatura f){
		double soma = 0;
		for (Boleto b: f.getBoletos()){
			soma += b.getValPago();
		}
		return soma;
		
	}
	
}