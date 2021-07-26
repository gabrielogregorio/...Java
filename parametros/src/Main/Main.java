package Main;
// No java só uma classe pode ser publica

class Calculo {
	void soma(int num1,int num2) {
		System.out.print(num1 + num2);
	}	
}

public class Main {
	public static void main(String args[]) {
		Calculo cal = new Calculo();
		cal.soma(4, 25);
	}
}
