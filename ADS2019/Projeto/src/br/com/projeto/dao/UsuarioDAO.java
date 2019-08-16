package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.projeto.beans.Usuario;
import br.com.projeto.conexao.Conexao;

public class UsuarioDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public UsuarioDAO () throws Exception {
		this.con = Conexao.queroConectar();
	}
	
	public Usuario getUser(int codigo) throws Exception {		
		stmt = con.prepareStatement
				("select * from RW_T_USUARIO where ID_USUARIO = ?");
		
		stmt.setInt(1, codigo);
		
		rs = stmt.executeQuery();
		
		if (rs.next()) {
			return new Usuario(
					rs.getInt("ID_USUARIO"),
					rs.getString("NM_USUARIO"),
					rs.getString("PW_USUARIO")
					);
		} else {
			return new Usuario();
		}
	}
	
	public void encerrar() throws Exception {
		con.close();
	}
	
}
