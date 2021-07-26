
public class Media{
	protected float soma;
	protected int contador;

	public Media(){
	    this.soma = 0;
	    this.contador = 0;
	}
   	
	public void acrescenta(int i){
	    this.soma += i;
	    this.contador++;
    }

    public float media_atual(){
    	return this.soma / this.contador;
    }
}
