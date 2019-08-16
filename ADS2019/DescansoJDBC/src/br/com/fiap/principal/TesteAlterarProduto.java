package br.com.fiap.principal;

import br.com.fiap.dao.ProdutoDAO;

public class TesteAlterarProduto {

	public static void main(String[] args) {
		ProdutoDAO dao = null;
		
		try {
			dao = new ProdutoDAO();
			dao.alterar(1, "TESTE1", 2.00, 10);
			System.out.println("Produto alterado com sucesso");
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
