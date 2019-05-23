package boundaries;

import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import boundaries.TelaCadastro;
import javax.swing.JFrame;

public class TelaInicial extends JFrame implements ActionListener {
	
	JFrame janela = new JFrame();
	Button btnCad = new Button("Cadastrar-se");
	Button btnLog = new Button("Login");
	Label lblCarx = new Label("CarX");
	
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()==btnCad) {
			
		TelaCadastro telaCad = new TelaCadastro();
	telaCad.setVisible(true);
		} 
	janela.dispose();
	}
	public  TelaInicial(){
		janela.setSize(800, 600);
		janela.getContentPane().setLayout(null);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		btnCad.setFont(new Font("Eras Demi ITC", Font.PLAIN, 18));
		btnCad.setBounds(77, 349, 223, 101);
		btnCad.addActionListener(this);
		janela.getContentPane().add(btnCad);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			}
		});
		
		
		
		btnLog.setFont(new Font("Eras Demi ITC", Font.PLAIN, 18));
		btnLog.setBounds(466, 349, 253, 101);
		janela.getContentPane().add(btnLog);
		
	
		lblCarx.setFont(new Font("Rockwell", Font.PLAIN, 27));
		lblCarx.setBounds(357, 113, 66, 69);
		janela.getContentPane().add(lblCarx);
		
		
		
	}
	

public static void main(String[] args) {
	new TelaInicial();
}



}
