package br.com.fiap.principal;

import br.com.fiap.dao.ProdutoDAO;

public class TesteDeletarProduto {

	public static void main(String[] args) {
		ProdutoDAO dao = null;
		
		try {
			dao = new ProdutoDAO();
			dao.deletar(1);
			System.out.println("Produto deletado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dao.encerrar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
