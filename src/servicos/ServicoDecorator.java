package servicos;

public abstract class ServicoDecorator implements IServico {

	protected IServico wrappee;
	
	public ServicoDecorator(IServico componente) {
		this.wrappee = componente;
	}
}
