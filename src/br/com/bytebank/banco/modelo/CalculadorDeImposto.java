package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {
	
	
	
	private double totalImposto;
	
	public void resgistro(Tributavel t) {
		double valor = t.getValotImposto();
		this.totalImposto+=valor;
		
		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
