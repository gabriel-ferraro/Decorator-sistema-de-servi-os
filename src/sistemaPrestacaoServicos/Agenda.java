package sistemaPrestacaoServicos;

import servicos.IServico;
import servicos.ServicoConcreto;

public class Agenda {

	public Cliente cliente;
	
	public Agenda(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void registrarServicos() {
		System.out.println("Servicos contratados por: " + cliente.nome);
		for(IServico servico: cliente.servicos) {
			System.out.printf("%s Valor: R$%.2f\n",
			servico.getDesc(),
			servico.calcularValor());
		}
	}
}
