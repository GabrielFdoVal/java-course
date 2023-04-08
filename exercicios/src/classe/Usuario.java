package classe;

public class Usuario {

	String nome;
	String email;
	
	
	Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			
			boolean nomeIgual = this.nome.equals(outro.nome);
			boolean emailIgual = this.email.equals(outro.email);
			
			return nomeIgual && emailIgual;
		}
		return false;
	}
}
