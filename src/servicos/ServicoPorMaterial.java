package servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicoPorMaterial extends ServicoDecorator {

	protected List<Material> materiais = new ArrayList<>();
	
	public ServicoPorMaterial(List<Material> materiais, IServico componente) {
		super(componente);
		this.materiais = materiais;
	}
	
	@Override
	public float calcularValor() {
		return this.wrappee.calcularValor() + calculaCustoMateriais();
	}
	
	public float calculaCustoMateriais() {
		float custoMateriais = 0;
		for(Material material: materiais) {
			custoMateriais += material.getValor();
		}
		return custoMateriais;
	}

	@Override
	public String getDesc() {
		return this.wrappee.getDesc() + " -> (Decorator servico por materiais)";
	}
}
