package formasDePagamento;

import java.util.Date;

public class Credito extends AbsPagamento {

	private String numeroCartao;
	private String nomeTitular;
	private Date dataValidade;
	private int codSeguranca;
	
	public Credito(String nome) {
		super(nome);
	}
	
	@Override
	public boolean isValid() {
		return true;
	}
}
