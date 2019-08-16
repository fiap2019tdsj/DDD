package br.com.projeto.principal;

import java.sql.Connection;

import br.com.projeto.conexao.Conexao;

public class TesteConexao {

	public static void main(String[] args) {
		Connection c = null;
		try {
			c = Conexao.queroConectar();
			System.out.println("Conectou");
			
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
