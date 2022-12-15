package servicos;

public class ServicoPorVolume extends ServicoDecorator {

	protected float volume;
	protected float valorServico;

	public ServicoPorVolume(float volume, float valorServico, IServico componente) {
		super(componente);
		this.volume = volume;
		this.valorServico = valorServico;
	}
	
	@Override
	public float calcularValor() {
		return this.wrappee.calcularValor() + this.valorServico * this.volume;
	}

	@Override
	public String getDesc() {
		return this.wrappee.getDesc() + " -> (Decorator servico por volume)";
	}
}
