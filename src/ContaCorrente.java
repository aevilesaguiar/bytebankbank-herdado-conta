
public class ContaCorrente extends Conta implements Tributavel {
	
	
	//construtor
	public ContaCorrente(int agencia, int numero) {
		
		super(agencia, numero);
	}
	
	
	
	@Override //anotação na configuração do java - sobrescreve um método @override - só escrever o nome do método Ex saca
	public void saca(double valor) throws SaldoInsufienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }



	@Override
	public void deposita(double valor) {
		super.saldo+=valor;
		
	}



	@Override
	public double getValotImposto() {
		
		return super.saldo*0.01;
	}

}
