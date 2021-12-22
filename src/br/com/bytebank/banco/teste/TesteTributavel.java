package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {


		ContaCorrente cc=new ContaCorrente(222, 333);
		cc.deposita(100.00);
		
		SeguroDeVida sv = new SeguroDeVida();

		CalculadorDeImposto calc= new CalculadorDeImposto();
		calc.resgistro(cc);
		calc.resgistro(sv);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
