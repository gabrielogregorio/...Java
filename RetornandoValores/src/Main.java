class Retangulo {
	public int width;
	public int height;
	
	public int areaTotal() {
		return width * height;
	}
	
	public boolean isQuadrado() {
		if (width == height) {
			return true;
		}
		return false;			
	}
}

public class Main {
	public static void main(String args[]) {
		Retangulo quadrado = new Retangulo();

		/* atribuindo valores a instância da classe */
		quadrado.width = 100;
		quadrado.height = 120;
		
		System.out.println(quadrado.areaTotal());
		System.out.println(quadrado.isQuadrado());		
	}
}
