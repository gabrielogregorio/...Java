class Janela{
	int largura,altura;
	
	// Contrutor da classe
	public Janela(int l,int a){
		largura = l;
	    altura = a;
	}
	
	void imprimir() {
		System.out.println("Altura = " + altura + " Largura = " + largura);
	}
}

public class Main {
	public static void main(String[] args) {
		Janela j = new Janela(240,350);
		j.imprimir();
	}
}
