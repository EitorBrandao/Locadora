package boundaries;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFunc implements ActionListener {

	JPanel loginFunc = new JPanel();
	JLabel lblID = new JLabel("ID");
	JLabel lblSenhaFunc = new JLabel("Senha");
	JTextField txtId = new JTextField();
	JTextField txtSenha = new JTextField();
	JButton btCad = new JButton("Cadastrar");
	JButton btConfirma = new JButton("Confirmar");

	public LoginFunc() {
		loginFunc.setLayout(null);
		
		loginFunc.add(lblID);
		loginFunc.add(lblSenhaFunc);
		loginFunc.add(txtId);
		loginFunc.add(txtSenha);
		loginFunc.add(btCad);
		loginFunc.add(btConfirma);

		lblID.setBounds(29, 44, 83, 14);
		lblSenhaFunc.setBounds(29, 94, 46, 14);

		txtId.setColumns(10);
		txtSenha.setColumns(10);

		txtId.setBounds(122, 41, 270, 20);
		txtSenha.setBounds(122, 91, 270, 20);

		btCad.setBounds(274, 192, 109, 30);
		btConfirma.setBounds(29, 192, 109, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btCad) {

			new TelaCadastroFunc();

		}

	}
}
