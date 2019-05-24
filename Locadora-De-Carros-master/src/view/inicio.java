package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import boundaries.TelaInicial;

public class inicio {
	
	private JPanel panel;

	public inicio(JPanel panel) {
		this.panel = panel; 
		
		JPanel pan = new JPanel();
		JLabel lbl = new JLabel ("Teste Janela 2");
		pan.add(lbl);
		
		
		panel.removeAll();
		panel.add(pan);
		panel.revalidate();
		panel.repaint();
		
	}
	
	// JFrame init = new JFrame("Aluguel de carros");
	public inicio() {
//		init.setVisible(true);
//		init.setSize(800, 600);
//		init.setLocation(600,200);
		
		
		
	}
}
