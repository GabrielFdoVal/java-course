package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o codigo entrada: ");
		int codigo = Integer.parseInt(scanner.nextLine());
		
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			System.out.println("O nome atual e: "+p.getNome());
			
			System.out.print("Informe o novo nome: ");
			String novoNome = scanner.nextLine();
			
			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			
			stmt.close();
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			stmt.close();
		} else {
			System.out.println("Pessoa nao encontrada");
		}
		
		scanner.close();
		conexao.close();
	}
}
