
public class ContaCorrente extends Conta implements Tributavel {
	
	
	//construtor
	public ContaCorrente(int agencia, int numero) {
		
		super(agencia, numero);
	}
	
	
	
	@Override //anota��o na configura��o do java - sobrescreve um m�todo @override - s� escrever o nome do m�todo Ex saca
	public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
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
