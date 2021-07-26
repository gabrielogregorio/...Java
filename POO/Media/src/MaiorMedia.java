public class MaiorMedia extends Media {

	public float maior = 0.f;
	public float menor = 0.f;
	public boolean inicio = true;
    	
   	public MaiorMedia() {
   	   	super();
   	}
 
   	public void obtem_maior_valor(float i) {
		if (inicio) {
			maior = i;
			menor = i;
			inicio = false;
		}
		else {

			if (i > maior)
				maior = i;

			if (i < menor)
				menor = i;
		}
   	}
   	
	public void acrescenta(float i){
		obtem_maior_valor(i);
		
	    this.soma += i;
	    this.contador++;
    }
	
	public float menor_numero() {
		return menor;
    }

	public float mmaior_numero() {
		return maior;
    }
}