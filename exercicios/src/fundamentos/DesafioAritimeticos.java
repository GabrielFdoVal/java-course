package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		double x1 = Math.pow(6 * (3 + 2), 2);
		double x2 = x1 / ( 3 * 2);
		
		double y1 = (1 - 5) * (2 - 7);
		double y2 = Math.pow(y1 / 2, 2);
		
		double final1 = Math.pow(x2 - y2, 3);
		double final2 = final1 / Math.pow(10, 3);
		
		System.out.println(final2);
	}
}
