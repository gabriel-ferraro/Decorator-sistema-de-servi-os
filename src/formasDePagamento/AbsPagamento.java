package formasDePagamento;

public abstract class AbsPagamento {
		
	private int id;
	private String nome;
	
	public AbsPagamento(String nome) {
		this.nome = nome;
	}
	
	public abstract boolean isValid();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
