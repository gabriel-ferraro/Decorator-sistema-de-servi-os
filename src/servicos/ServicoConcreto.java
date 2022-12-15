package servicos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServicoConcreto implements IServico {

	protected String nome;
	protected String desc;
	protected float valorServico;
	protected String dataServico;
	
	public ServicoConcreto(String nome, String desc, float valor, LocalDate data) {
		this.nome = nome;
		this.desc = desc;
		this.valorServico = valor;
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataServico = data.format(dateFormat);
	}

	@Override
	public float calcularValor() {
		return this.valorServico;
	}

	@Override
	public String getDesc() {
		return this.nome + "\tdata: " + this.dataServico;
	}
}
