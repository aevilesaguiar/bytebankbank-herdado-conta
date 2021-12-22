package br.com.bytebank.banco.modelo;

/**
 * 
 * @author AEVILES
 *
 */

public abstract class Conta {
	
	protected double saldo;//eu tilizei protected para que saldo ficasse visivel para os filhos que no caso é conta Poupança e Cont corrente
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total=0;
	
	/**
	 * cONSTRUTOR PARA INICIALIZAR O OBJETO CONTA A PARTIR DA AGENCIA E NUMERO
	 * @param agencia
	 * @param numero
	 */
	
	
	//contrutor 
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas é:"+ (total));
		this.agencia=agencia;
		this.numero=numero;
		System.out.println("Estou criando uma conta"+this.numero);
	}
	
	
	
	public Conta( int numero) {
	
		this.numero=numero;
		System.out.println("Estou criando uma conta"+this.numero);
	}
	
	//método abstrato são apenas o corpo, eles precisam ser implmentados pelo o filho
	public abstract void deposita (double valor);
	
	/**
	 * vALOR PRECISA SER MAIOR DO QUE O SALDO
	 * 
	 * @param valor
	 * @throws SaldoInsufienteException
	 */

	public void saca(double valor) throws SaldoInsufienteException {
	    if(this.saldo < valor) {
	        throw new SaldoInsufienteException("");
	    }
	    this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino ) throws SaldoInsufienteException {
		this.saca(valor);
        destino.deposita(valor);
	
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	
	
	
	//set altera - métodos que alteram um atributo eles são void , não devolvem nada
	public void setNumero(int numero) {
		
		if(numero<=0) {
			System.out.println("Não pode ser 0");
			return;
		}
		this.numero=numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		
		if(agencia<=0) {
			System.out.println("Não pode valor menor ou igual a zero ");
			return;
		}
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;//por que é um atributo privado
	}

	
	

}
