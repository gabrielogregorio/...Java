class Fatorial {
	int fat(int n) {
        /* Estamos na expressão Mínima! */
		if (n<=1)
			return 1;
		
		int r = fat(n-1)*n;
		return r;
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println(new Fatorial().fat(5));
	}
}
