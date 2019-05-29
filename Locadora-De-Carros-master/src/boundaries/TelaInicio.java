package boundaries;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.UsuarioControl;
import entities.Usuario;

public class TelaInicio extends Janela implements ActionListener {
	
	String confNome;
	String confSenha;
	JPanel painelIni = new JPanel ();
	JTextField txtLog = new JTextField();
	JTextField txtSenha = new JTextField();
	JLabel lblLog = new JLabel("CPF ou Email");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblCad = new JLabel ("É novo? Cadastre-se!");
	JButton btCad = new JButton ("Cadastrar-se");
	JButton btConfirma = new JButton("Confirmar");
	JButton btAreaFunc = new JButton("Área de Funcionarios");
	
	public TelaInicio () {
				
		principal.getContentPane().add(painelIni);
		painelIni.setLayout(null);
		painelIni.add(txtLog);
		painelIni.add(txtSenha);
		painelIni.add(lblLog);
		painelIni.add(lblSenha);
		painelIni.add(lblCad);
		painelIni.add(btConfirma);
		painelIni.add(btCad);
		painelIni.add(btAreaFunc);
		principal.getContentPane().add(painelIni);
		principal.setSize(450, 350);
		
		btCad.setSize(109, 30);
		btCad.setLocation(283, 263);
		
		txtLog.setBounds(122, 41, 270, 20);
		txtLog.setColumns(10);
		
		
		txtSenha.setColumns(10);
		txtSenha.setBounds(122, 91, 270, 20);
		
		
		lblLog.setBounds(29, 44, 83, 14);
		lblSenha.setBounds(29, 94, 46, 14);
		lblCad.setBounds(283, 216, 121, 30);
		btConfirma.setBounds(29, 145, 109, 23);
		btAreaFunc.setBounds(29, 250, 157, 43);
		
		btConfirma.addActionListener(this);
		btCad.addActionListener(this);
		btAreaFunc.addActionListener(this);
	}

	
@Override
public void actionPerformed(ActionEvent e) {
	
	if (e.getSource() == btCad) {
	
	TelaCadastroUser cad = new TelaCadastroUser();
		
		principal.remove(painelIni);
		principal.setSize(800, 600);
		principal.getContentPane().add(cad.painelCadUser);
		principal.repaint();
		principal.revalidate();	
	
	} else if (e.getSource() == btAreaFunc) {
	
		 String[] options = { "Sim", "Não" };  
	        int result = JOptionPane.showOptionDialog(null, "Você já é cadastrado(a)", "Área de Funcionários",   
	                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
		switch (result) { 
		
		case 0 :
			JOptionPane.showInputDialog(null, "Digite seu ID", "Login");
			JOptionPane.showInputDialog(null, "Digite sua Senha", "Senha");
			
			
			break;
			
		case 1: 
			TelaCadastroFunc func = new TelaCadastroFunc();
			
			principal.remove(painelIni);
			principal.setSize(800, 600);
			principal.getContentPane().add(func.painelCadFunc);
			principal.repaint();
			principal.revalidate();
			break;
		}
	
	}  


}

}
