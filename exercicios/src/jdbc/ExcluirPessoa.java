package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o codigo pra excluir");
		int codigo = Integer.parseInt(scanner.nextLine());
		
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida");
		} else {
			System.out.println("Nada feito");
		}
		
		
		scanner.close();
		conexao.close();
	}
}
