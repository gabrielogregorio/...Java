class Janela{
	int altura,largura;
	
	public Janela(int altura,int largura){
		this.largura = largura;
		this.altura = altura;
	}
	
	public void imprime() {
		System.out.println(altura  + " " +  largura);
	}
	
	public Janela(){
		this(100,200);
		System.out.println("L = " + largura + "A =" + altura);
	}
}

public class Main {
	public static void main(String[] args) {
		Janela j = new Janela(250,480);
		j.imprime();	

		Janela i = new Janela();
		i.imprime();	

	}
}
