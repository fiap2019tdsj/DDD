package br.com.fiap.principal;

import br.com.fiap.dao.ProdutoDAO;

public class TesteConsultaProduto {

	public static void main(String[] args) {
		ProdutoDAO dao = null;
		
		try {
			dao = new ProdutoDAO();
			System.out.println(dao.retornarSubTotal(3));
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
