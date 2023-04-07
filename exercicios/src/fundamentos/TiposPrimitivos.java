package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = false;
		
		char status = 'A';
		
		System.out.println(anosEmpresa*365);
		System.out.println(numeroVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println("O id: "+id+" ganha: "+salario);
		System.out.println("Ferias: "+estaDeFerias);
		System.out.println("Status: "+status);
	}
}
