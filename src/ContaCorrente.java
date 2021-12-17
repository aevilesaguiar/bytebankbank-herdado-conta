
public class ContaCorrente extends Conta {
	
	
	//construtor
	public ContaCorrente(int agencia, int numero) {
		
		super(agencia, numero);
	}
	
	
	
	@Override //anota��o na configura��o do java - sobrescreve um m�todo @override - s� escrever o nome do m�todo Ex saca
	public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

}
