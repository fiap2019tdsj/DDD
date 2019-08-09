package br.com.fiap.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_1 {

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection
				("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", 
						"RM83183",
						"050891");
			
			Statement stmt = c.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from RW_T_USUARIO");
			
			while (rs.next()) {
				System.out.println("ID: " + rs.getString("ID_USUARIO") 
					+ " | Nome: " + rs.getString("NM_USUARIO") 
					+ " | Senha: " + rs.getString("PW_USUARIO")
				);
			}
					
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}