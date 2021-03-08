package tdd_processador;

public class Pagamento {
	
	private double valPago;
	private String data;
	private String tipoPagamento;
	
	public Pagamento(double valPago, String data, String tipoPagamento) {
		this.valPago = valPago;
		this.data = data;
		this.tipoPagamento = tipoPagamento;
	}
	
	public Pagamento() {
		
	}
	
	public double valPago() {
		return valPago;
	}
	
	public void setValPago(double valPago) {
		this.valPago = valPago;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
