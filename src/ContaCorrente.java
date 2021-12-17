
public class ContaCorrente extends Conta {
	
	
	//construtor
	public ContaCorrente(int agencia, int numero) {
		
		super(agencia, numero);
	}
	
	
	
	@Override //anotação na configuração do java - sobrescreve um método @override - só escrever o nome do método Ex saca
	public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

}
