package formasDePagamento;

public class Boleto extends AbsPagamento {

	private String numeroBoleto;
	
	public Boleto(String nome) {
		super(nome);
	}

	@Override
	public boolean isValid() {
		return true;
	}	
}
