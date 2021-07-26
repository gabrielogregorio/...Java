public class lambda {
	public static void main(String[] args) {
		System.out.println("Iniando os estudos");
		
		// implementação da classe Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Estudando métodos");
			}
		};
		
		// usando a expressão lambda

		// lista de argumentos ()
		// seta - demarca que estamos trabalhando com uma função lambda.
		// corpo e return

		Runnable r2 = () -> System.out.println("Estudando a expressão lambda.");
		
		r1.run();
		r2.run();
 	}
}
