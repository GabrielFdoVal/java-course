package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Joao");
		dao.incluir(sql, "Maria");
		dao.incluir(sql, "Claudia");
	}
}
