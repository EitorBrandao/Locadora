package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.UsuarioControl;
import entities.Usuario;

public class TelaCadastroUser implements ActionListener {

	JPanel painelCadUser = new JPanel();
	JLabel lblNome = new JLabel("Nome");
	JLabel lblEmail = new JLabel("Email");
	JLabel lblCpf = new JLabel("CPF");
	JLabel lblEnd = new JLabel("Endereço");
	JLabel lblNum = new JLabel("Número");
	JLabel lblTel = new JLabel("Telefone");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfSenha = new JLabel("Confirme a senha");
	JTextField txtNome = new JTextField();
	JTextField txtEmail = new JTextField();
	JTextField txtCpf = new JTextField();
	JTextField txtEnd = new JTextField();
	JTextField txtNum = new JTextField();
	JTextField txtTel = new JTextField();
	JTextField txtSenha = new JTextField();
	JTextField txtConfSenha = new JTextField();
	JButton btConfirmaCad = new JButton("Confirmar");
	JLabel lblCadUser = new JLabel("Cadastro de Usuarios");

	public TelaCadastroUser() {

		painelCadUser.setLayout(null);

		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNome.setBounds(45, 160, 46, 14);
		lblEmail.setBounds(45, 220, 98, 14);
		lblCpf.setBounds(45, 280, 46, 14);
		lblEnd.setBounds(45, 340, 70, 20);
		lblNum.setBounds(500, 340, 65, 14);
		lblTel.setBounds(45, 400, 70, 14);
		lblSenha.setBounds(45, 460, 45, 14);
		lblConfSenha.setBounds(45, 520, 135, 14);

		painelCadUser.add(lblNome);
		painelCadUser.add(lblCpf);
		painelCadUser.add(lblEmail);
		painelCadUser.add(lblEnd);
		painelCadUser.add(lblNum);
		painelCadUser.add(lblTel);
		painelCadUser.add(lblSenha);
		painelCadUser.add(lblConfSenha);

		txtNome.setBounds(125, 160, 320, 20);
		txtEmail.setBounds(125, 220, 320, 20);
		txtCpf.setBounds(125, 280, 320, 20);
		txtEnd.setBounds(125, 340, 320, 20);
		txtNum.setBounds(576, 340, 80, 20);
		txtTel.setBounds(125, 400, 320, 20);
		txtSenha.setBounds(198, 460, 250, 20);
		txtConfSenha.setBounds(198, 519, 250, 20);

		txtNome.setColumns(10);
		txtEmail.setColumns(10);
		txtCpf.setColumns(10);
		txtEnd.setColumns(10);
		txtNum.setColumns(10);
		txtTel.setColumns(10);
		txtSenha.setColumns(10);
		txtConfSenha.setColumns(10);

		painelCadUser.add(txtNome);
		painelCadUser.add(txtEmail);
		painelCadUser.add(txtCpf);
		painelCadUser.add(txtEnd);
		painelCadUser.add(txtNum);
		painelCadUser.add(txtTel);
		painelCadUser.add(txtSenha);
		painelCadUser.add(txtConfSenha);

		btConfirmaCad.setBounds(548, 518, 114, 23);
		btConfirmaCad.addActionListener(this);
		painelCadUser.add(btConfirmaCad);

		lblCadUser.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCadUser.setBounds(301, 27, 184, 55);
		painelCadUser.add(lblCadUser);

	}

	Usuario user = new Usuario();
	UsuarioControl userControl = new UsuarioControl();

	public void UserToBoundary() {

		user.setNome(txtNome.getText());
		user.setCpf(txtCpf.getText());
		user.setEmail(txtEmail.getText());
		user.setEndereco(txtEnd.getText());
		user.setCasaNum(txtNum.getText());
		user.setTelefone(txtTel.getText());
		user.setSenha(txtSenha.getText());

		txtNome.setText(null);
		txtCpf.setText(null);
		txtEmail.setText(null);
		txtEnd.setText(null);
		txtNum.setText(null);
		txtTel.setText(null);
		txtSenha.setText(null);
		txtConfSenha.setText(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btConfirmaCad) {
			if ((txtNome.getText().equals("")) | (txtCpf.getText().equals("")) | (txtEmail.getText().equals(""))
					| (txtEnd.getText().equals("")) | (txtNum.getText().equals("")) | (txtTel.getText().equals(""))) {
				JOptionPane.showMessageDialog(null, "Insira seus dados");
			} else if (txtSenha.getText().equals("") | txtConfSenha.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Digite uma senha");
			} else if (txtConfSenha.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Confirme sua senha");
			} else {
				UserToBoundary();
				userControl.CadastraUser(user);
			}
		}
	}
}
