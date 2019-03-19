
public class Produto {
	private String descricao;
	private double valor;
	private int codigo;
	private String marca;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getBasico() {
		return codigo + " - " + descricao;
	}
	
	public String getDetalheMarca() {
		return "A marca é: " + marca;
	}
	
	public double getDesconto() {
		return valor * 0.9;
	}
	
	public String getValores() {
		return "Produto sem parcelar: " + valor  + "\nProduto parcelado: " + (valor * 1.1);
	}
	
	public void setBasico(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public void setDesconto(double valor) {
		this.valor = valor * 0.9;
	}
	
	public void setAtualizar(double valor, double porcentagem) {
		this.valor = valor + (valor * (porcentagem/100));
	}
}
