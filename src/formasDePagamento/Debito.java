package formasDePagamento;

public class Debito extends AbsPagamento {

	private String numeroCartao;
	private String nomeTitular;
	
	public Debito(String nome) {
		super(nome);
	}
	
	@Override
	public boolean isValid() {
		return true;
	}
}
