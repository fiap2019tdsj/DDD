import java.util.Date;

public class Pagamento {
	Pedido pedido;
	String forma;
	float valor;
	Date data;
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public String getForma() {
		return forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
}
