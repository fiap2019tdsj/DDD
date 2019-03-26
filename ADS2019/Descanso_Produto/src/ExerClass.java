
public class ExerClass {

	public static void main(String[] args) {
		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		
		prod1.setCodigo(345);
		prod1.setDescricao("Churros");
		prod1.setValor(10);
		prod1.setMarca("DietaJá");
		
		System.out.println(prod1.getBasico());
		
		System.out.println(prod1.getDetalheMarca());
		
		System.out.println("O produto com desconto é " + prod1.getDesconto());
		
		System.out.println(prod1.getValores());
		
		prod2.setBasico(100, "whatever");
		System.out.println(prod2.getBasico());
		
		prod2.setDesconto(10);
		System.out.println(prod2.getValor());
		
		prod2.setAtualizar(100, 1);
		System.out.println(prod2.getValor());
	}

}
