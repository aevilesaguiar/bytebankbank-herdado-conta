


public class Conta {
	
	private	double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total=0;
	
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
	
	void deposita (double valor) {
		
		this.saldo+=valor;
	}

	public boolean saca(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino ) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
		
		
	
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
