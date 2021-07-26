import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		MaiorMedia notas = new MaiorMedia();

		boolean loop = true;	
		float nota_digitada =0.f;
		
		while (loop) {
			nota_digitada = Float.parseFloat( JOptionPane.showInputDialog("[0 - interrompe] Digite a nota: ") );

			if (nota_digitada == 0.f)
				loop = false;
			else
                notas.acrescenta( nota_digitada );
		}
		
		JOptionPane.showMessageDialog(null, "Sua média foi de "+ notas.media_atual());
		JOptionPane.showMessageDialog(null, "O maior valor foi "+ notas.maior);
		JOptionPane.showMessageDialog(null, "O menor valor foi "+ notas.menor);
		
	}
}
