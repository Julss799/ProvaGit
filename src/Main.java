
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		
		n++;
		
		if(esParell(n)) {
			System.out.println(n+" es parell.");
		}
		
		
		saludar("pau");
	}

	public static void saludar(String name) {
		System.out.println("Hola "+name);
	}
	
	public static boolean esParell(int n) {
		return n%2==0;
	}
}
