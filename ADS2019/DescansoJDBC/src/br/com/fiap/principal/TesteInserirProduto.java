package br.com.fiap.principal;

import br.com.fiap.dao.ProdutoDAO;

public class TesteInserirProduto {

	public static void main(String[] args) {
		ProdutoDAO dao = null;
		
		try {
			dao = new ProdutoDAO();
			dao.inserir(1, "TESTE1", 1.00, 10);
			System.out.println("Produto inserido com sucesso");
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
