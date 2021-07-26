import javax.swing.*;
import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JCheckBoxExercicio extends JFrame {
	JPanel superior, meio, inferior;
	JLabel rotulo;
	JCheckBox primeira, segunda, terceira, quarta;
	
	public JCheckBoxExercicio() {
		super("Titulo da Janela");
		
		// Label
		rotulo = new JLabel("Quais são sua linguagens preeridas?");

		// Criando instâncias dos CheckBox
		primeira = new JCheckBox("Java");
        segunda  = new JCheckBox("C++");
        terceira = new JCheckBox("PythonPpp");
        quarta   = new JCheckBox("Ruby");
        
        // Dando sublinhado a primeira letra
        primeira.setMnemonic(KeyEvent.VK_J);
        segunda.setMnemonic(KeyEvent.VK_C);
        terceira.setMnemonic(KeyEvent.VK_P);
        quarta.setMnemonic(KeyEvent.VK_R);
        
        // Selecionando o primeiro
        primeira.setSelected(true);

        // Definindo um botão
        JButton ok = new JButton("Responder");

		// Criando a instância da tela
		Container tela = getContentPane();
		
		// Instânciando um gerenciador de Layout
		BorderLayout layout = new BorderLayout();
		
		// Atribuindo a tela ao gerenciador de layout
		tela.setLayout(layout);
		
		// Instânciando o tratador de eventos
		Tratador trat = new Tratador();
        ok.addActionListener(trat);
		
        // Criando Três panel's (Equivalente ao Frame)      
        superior = new JPanel();
        meio = new JPanel();
        inferior = new JPanel();

        // Adicionando objetos aos Panel's
        superior.add(rotulo);

        meio.add(primeira);
        meio.add(segunda);
        meio.add(terceira);
        meio.add(quarta);
        
        inferior.add(ok);

        // Configurando posicionamento        
        superior.setLayout(new FlowLayout(FlowLayout.LEFT));
        meio.setLayout(new FlowLayout(FlowLayout.LEFT));
        inferior.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // Adicionando os Panel's na tela
        tela.add(superior, BorderLayout.NORTH);
        tela.add(meio, BorderLayout.CENTER);
        tela.add(inferior, BorderLayout.SOUTH);
        
        pack(); // Atualizando informações?
        
        // Tamanho da janela e visibilidade
        setSize(600, 400);
        setVisible(true);
		}

	public static void main(String args[]) {
		JCheckBoxExercicio app = new JCheckBoxExercicio();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class Tratador implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		String escolhas = "";

		// Loop pelos JCheckbox
		for (int i = 0; i < meio.getComponentCount(); i++) {
			Component comp = meio.getComponent(i);
			
			// Pegando apenas CheckBox
			if (comp.getClass().getName().equals("" + "javax.swing.JCheckBox"))
				
				// Verifica se o componente está selecionado
				if ( ( (JCheckBox)(comp)).isSelected() )

					// Salva na string o texto do valor selecionado
					escolhas += ((JCheckBox)(comp)).getText() + "\n";
		}
		// Mostrando uma mensagem na tela
		JOptionPane.showMessageDialog(null, escolhas);
		}
	}
}
