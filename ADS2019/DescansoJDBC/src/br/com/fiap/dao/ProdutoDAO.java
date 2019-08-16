package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.conexao.Conexao;

public class ProdutoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;	
	
	public ProdutoDAO() throws Exception {
		con = Conexao.queroConectar();
	}
	
	public double retornarSubTotal(int codigo) throws Exception {
		stmt = con.prepareStatement("select * from RW_T_PRODUTO where CD_PRODUTO = ?");
		stmt.setInt(1, codigo);
		
		rs = stmt.executeQuery();
		
		if (rs.next()) {
			return (rs.getInt("QT_PRODUTO")) * (rs.getDouble("VL_PRODUTO"));
		} else {
			return 0.0;
		}
	}
	
	public void deletar(int codigo) throws Exception {
		stmt = con.prepareStatement("delete from RW_T_PRODUTO where CD_PRODUTO = ?");
		stmt.setInt(1, codigo);
		
		stmt.executeUpdate();
	}
	
	public void inserir(int codigo, String descricao, double valor, int quantidade) throws Exception {
		stmt = con.prepareStatement("insert into RW_T_PRODUTO values (?, ?, ?, ?)");
		stmt.setInt(1, codigo);
		stmt.setString(2, descricao);
		stmt.setDouble(3, valor);
		stmt.setInt(4, quantidade);
		
		stmt.executeUpdate();
	}
	
	public void alterar(int codigo, String descricao, double valor, int quantidade) throws Exception {
		stmt = con.prepareStatement("update RW_T_PRODUTO set DS_PRODUTO = ?, VL_PRODUTO = ?, QT_PRODUTO = ? where CD_PRODUTO = ?");
		stmt.setString(1, descricao);
		stmt.setDouble(2, valor);
		stmt.setInt(3, quantidade);
		stmt.setInt(4, codigo);
		
		stmt.executeUpdate();
	}
	
	public void encerrar() throws Exception {
		con.close();
	}
}
