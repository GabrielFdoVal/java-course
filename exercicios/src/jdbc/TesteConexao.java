package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "doval13";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conectou");
		
		conexao.close();
	}
}
