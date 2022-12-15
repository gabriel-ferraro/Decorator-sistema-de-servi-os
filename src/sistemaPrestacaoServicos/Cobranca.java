package sistemaPrestacaoServicos;

import servicos.IServico;

public class Cobranca {
	
	public void cobrarCliente(Agenda agendamento) {
		System.out.printf("%nTotal cobrado de %s: R$%.2f", agendamento.cliente.nome, this.totalServicos(agendamento));
		System.out.printf(" - Pago via %s", agendamento.cliente.getFormaPagamento().getNome());
	}
	
	public float totalServicos(Agenda agendamento) {
		float total = 0;
		for(IServico valor: agendamento.cliente.servicos) {
			total += valor.calcularValor();
		}
		return total;
	}
}
