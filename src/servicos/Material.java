package servicos;

public class Material {

	public String nome;
	private float valor;
	
	public Material(String nomeMaterial, float valMaterial) {
		this.nome = nomeMaterial;
		this.valor = valMaterial;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
