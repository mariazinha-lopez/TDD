package tdd_processador;

import java.util.ArrayList;

public class Fatura {

	private String data;
	private double valorTotal;
	private String nomeCliente;
	private String status;
	private ArrayList<Boleto> boletos;
	
	
	public Fatura(String data, double valorTotal, String nomeCliente, String status) {	
		this.data = data;
		this.valorTotal = valorTotal;
		this.nomeCliente = nomeCliente;
		this.status = status;
		boletos = new ArrayList<Boleto>();

	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public ArrayList<Boleto> getBoletos() {
		return boletos;
	}


	public void adicionarBoleto(Boleto boleto) {
		boletos.add(boleto);
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
}
