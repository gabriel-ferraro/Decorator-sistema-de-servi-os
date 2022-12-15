package sistemaPrestacaoServicos;

import java.util.ArrayList;
import java.util.List;

import formasDePagamento.AbsPagamento;
import servicos.IServico;

public class Cliente {

	protected String nome;
	protected String cpf;
	private AbsPagamento formaPagamento;
	public List<IServico> servicos;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.servicos = new ArrayList<>();
	}
	
	public AbsPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(AbsPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
