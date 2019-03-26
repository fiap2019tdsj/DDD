import java.util.Scanner;

public class ExerClass2 {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		p1.setCodigo(entrada.nextInt());
		
		System.out.println("Digite o valor do produto: ");
		p1.setValor(entrada.nextDouble());
		
		System.out.println("Digite a descrição do produto: ");
		p1.setDescricao(entrada.next());
		p1.setDescricao(p1.getDescricao() + entrada.nextLine());
		
		System.out.println("Digite a marca do produto: ");
		p1.setMarca(entrada.next());
		p1.setMarca(p1.getDescricao() + entrada.nextLine());
		
		System.out.println("Produto 1: " + p1.getDescricao() + " - " + p1.getValor());
		
		entrada.close();
	}

}
