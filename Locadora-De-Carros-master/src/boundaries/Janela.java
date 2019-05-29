package boundaries;

import javax.swing.JFrame;

public class Janela {
	JFrame principal = new JFrame ("CarX");
	
	public Janela () {
		
		principal.setSize (800, 600);
		principal.setVisible(true);
		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}
