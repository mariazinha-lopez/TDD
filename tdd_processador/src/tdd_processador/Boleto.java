package tdd_processador;

public class Boleto {

	private String codBoleto;
	private String data;
	private double valPago;
	
	public Boleto(String codBoleto, String data, double valPago) {
		this.codBoleto = codBoleto;
		this.data = data;
		this.valPago = valPago;
	}

	public double getValPago() {
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

	public String getCodBoleto() {
		return codBoleto;
	}

	public void setCodBoleto(String codBoleto) {
		this.codBoleto = codBoleto;
	}
}
