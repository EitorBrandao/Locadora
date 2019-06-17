package boundaries;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUser {

	String confNome;
	String confSenha;
	JPanel loginUser = new JPanel();
	JTextField txtLog = new JTextField();
	JPasswordField txtSenha = new JPasswordField();
	JLabel lblLog = new JLabel("CPF ou Email");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblCad = new JLabel("É novo? Cadastre-se!");
	JButton btCad = new JButton("Cadastrar-se");
	JButton btConfirma = new JButton("Confirmar");

	public LoginUser() {

		loginUser.setLayout(null);
		loginUser.add(lblLog);
		loginUser.add(lblSenha);
		loginUser.add(lblCad);
		loginUser.add(txtLog);
		loginUser.add(txtSenha);
		loginUser.add(btConfirma);
		loginUser.add(btCad);

		lblLog.setBounds(29, 44, 83, 14);
		lblSenha.setBounds(29, 94, 46, 14);
		lblCad.setBounds(274, 145, 121, 30);

		txtLog.setColumns(10);
		txtSenha.setColumns(10);

		txtLog.setBounds(122, 41, 270, 20);
		txtSenha.setBounds(122, 91, 270, 20);

		btCad.setBounds(274, 192, 109, 30);
		btConfirma.setBounds(29, 192, 109, 30);

	}

}