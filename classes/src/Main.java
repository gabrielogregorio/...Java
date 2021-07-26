public class Main {
	
	public static void metodo() {		
		System.out.println("Impresso atravéz de um método");		
	}
	
	public static void main(String[] args) {
		metodo();

		Mobile mobile1;                  /* mobile do tipo Mobile      */ 
		mobile1 = new Mobile();          /* Criando uma nova instancia */
		Mobile mobile2 = new Mobile(); 
		
		/* Volume e ligado pode ser acessado por fora. */ 
		mobile1.volume = 10;
		mobile1.ligado = true;
		mobile2.ligado = false;
		
		System.out.println("Mobile1 = " + mobile1.ligado + "| Mobile2 = "  + mobile2.ligado);		
	} 

}

/* 
	Definição mínima de uma classe
	class MinhaClasse extends Object implements xyz{ // não precisa de extender para a object, mas ela está implicita... xy\ é uma interface
		
		 - Campo
		 - Contrutores(multiplos)
		 - métodos
		
		1) modificadoresde acesso
		  a) public
    		b) provate
	    	c) protected
	    	d) Sem modificadores
	    	
	    2) Atribuir letra maiuscula ( Padrão)
	    3) Extender outra(extends)
	    4) Interface que nossa classe irá implementar
	    5) Corpo da classe {}
*/
		
