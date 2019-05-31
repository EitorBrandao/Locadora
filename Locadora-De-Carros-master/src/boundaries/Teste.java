package boundaries;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Teste {
JFrame teste = new JFrame ("Teste");
JTabbedPane t1 = new JTabbedPane(JTabbedPane.TOP);

JPanel painel = new JPanel();
	public Teste () {
		TelaInicio tela1 = new TelaInicio();
		teste.setSize(800, 600);
		teste.setVisible(true);
		t1.setBounds(0, 0, 434, 42);
		teste.getContentPane().setLayout(null);
		painel.add(t1);
		t1.addTab("teste", tela1.painelIni);
		
		
		
		
		
		
		
		
	}

public static void main(String[] args) {
	new Teste();
}
}
