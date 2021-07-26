/* Overloading */
class Sobrecarga {
	void imprime(String s) {
		System.out.println(s);
	}
	
	void imprime(String s1, String s2) {
		System.out.println(s1 + " == " + s2);
	}
	
	void imprime(String s1, int num1) {
		System.out.println(s1 + " -- " + num1);
	}
}


public class Main {
	public static void main(String[] args) {
		Sobrecarga sob = new Sobrecarga();

		sob.imprime("Olá mundo");
		sob.imprime("José","Carlos");
		sob.imprime("Mariana",22);	
	}
}
