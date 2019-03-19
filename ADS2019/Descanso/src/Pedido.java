
public class Pedido {
	int numPedido;
	Pessoa cliente;
	ItemPedido itemPedido;
	Funcionario funcionario;
	
	public int getNumPedido() {
		return numPedido;
	}
	
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	
	public Pessoa getCliente() {
		return cliente;
	}
	
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	public ItemPedido getItemPedido() {
		return itemPedido;
	}
	
	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
