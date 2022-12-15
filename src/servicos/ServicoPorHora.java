package servicos;

public class ServicoPorHora extends ServicoDecorator {
	
	protected float hora;
	protected float valorServico;
	
	public ServicoPorHora(float hora, float valorServico, IServico componente) {
		super(componente);
		this.hora = hora;
		this.valorServico = valorServico;
	}
	
	@Override
	public float calcularValor() {
		return this.wrappee.calcularValor() + this.valorServico * this.hora;
	}

	@Override
	public String getDesc() {
		return this.wrappee.getDesc() + " -> (Decorator servico por hora)";
	}
}
