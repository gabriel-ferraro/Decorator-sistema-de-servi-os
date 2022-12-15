package main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import formasDePagamento.Boleto;
import servicos.Material;
import servicos.ServicoConcreto;
import servicos.ServicoDecorator;
import servicos.ServicoPorHora;
import servicos.ServicoPorMaterial;
import servicos.ServicoPorVolume;
import sistemaPrestacaoServicos.Agenda;
import sistemaPrestacaoServicos.Cliente;
import sistemaPrestacaoServicos.Cobranca;

public class TesteServicos {

	public static void main(String[] args) {

		System.out.println("Sistema de prestacao de servicos \n");
		
		//instanciando cliente
		Cliente cliente1 = new Cliente("Ferraro");
		
		//instanciando forma de pagamento do cliente
		Boleto boleto = new Boleto("boleto");
		cliente1.setFormaPagamento(boleto);
		 	
		//servico1 -> servico cobrado por hora e volume
		ServicoDecorator servico1 = new ServicoPorHora(
										3, 10, new ServicoPorVolume(
												3, 10, new ServicoConcreto(
														"drenagem", "succao de liquidos", 15, LocalDate.of(2022, Month.MAY, 7))));
		//LocalDate.of(2022, Month.MAY, 7))))
		
		//servico2 -> servico cobrado por materiais e volume
		ServicoConcreto servico2 = new ServicoConcreto("manutencao", "Reparo e manutencao", 20, LocalDate.of(2022, Month.MAY, 5));
		
		Material madeira = new Material("madeira", 10);
		Material pregos = new Material("pregos", 5);
		List<Material> materiais = new ArrayList<>();
		Collections.addAll(materiais, madeira, pregos);
		ServicoPorMaterial servicoMaterial = new ServicoPorMaterial(materiais, servico2);
		
		ServicoPorVolume servicoVolume = new ServicoPorVolume(15, 10, servicoMaterial);
		
		//Agendamento
		Collections.addAll(cliente1.servicos, servico1, servicoVolume); //adicionando servicos a lista de servicos do cliente1
		Agenda agendamento1 = new Agenda(cliente1);
		
		//Cobranca
		Cobranca cobranca1 = new Cobranca();
		
		agendamento1.registrarServicos();
		cobranca1.cobrarCliente(agendamento1);
	}
}
