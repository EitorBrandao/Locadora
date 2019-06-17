package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.CadastroUsuarioControl;
import entities.Usuario;

public class TelaCadastroUser implements ActionListener {
	Usuario user = new Usuario();
	CadastroUsuarioControl userControl = new CadastroUsuarioControl();

	JFrame telaCadUser = new JFrame("Cadastro de Usuário");
	JPanel painelCadUser = new JPanel();
	JLabel lblNome = new JLabel("Nome");
	JLabel lblCpf = new JLabel("CPF");
	JLabel lblEnd = new JLabel("Endereço");
	JLabel lblNum = new JLabel("Número");
	JLabel lblTel = new JLabel("Telefone");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfSenha = new JLabel("Confirme a senha");
	JLabel lblEmail = new JLabel("Email");
	JLabel lblCadUser = new JLabel("Cadastro de Usuários");

	JTextField txtNome = new JTextField();
	JTextField txtCpf = new JTextField();
	JTextField txtEmail = new JTextField();
	JTextField txtEnd = new JTextField();
	JTextField txtTel = new JTextField();
	JTextField txtSenha = new JTextField();
	JTextField txtConfSenha = new JTextField();
	JTextField txtNum = new JTextField();

	JButton btConfirmaCad = new JButton("Confirmar");
	JButton btHome = new JButton("HOME");

	public TelaCadastroUser() {

		// configs da tela
		telaCadUser.setSize(800, 600);
		telaCadUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadUser.setResizable(false);
		telaCadUser.getContentPane().add(painelCadUser);
		telaCadUser.setVisible(true);
		telaCadUser.setLocationRelativeTo(null);
		painelCadUser.setLayout(null);

		// fontes dos labels
		lblCadUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));

		// posições e tamanho dos labels
		lblCadUser.setBounds(275, 27, 250, 55);
		lblNome.setBounds(45, 120, 46, 14);
		lblEmail.setBounds(45, 180, 98, 14);
		lblCpf.setBounds(45, 240, 46, 14);
		lblEnd.setBounds(45, 300, 70, 19);
		lblNum.setBounds(501, 300, 65, 14);
		lblTel.setBounds(45, 360, 70, 14);
		lblSenha.setBounds(45, 420, 46, 14);
		lblConfSenha.setBounds(45, 480, 135, 14);

		// adicionando os labels no painel
		painelCadUser.add(lblCadUser);
		painelCadUser.add(lblNome);
		painelCadUser.add(lblEmail);
		painelCadUser.add(lblCpf);
		painelCadUser.add(lblEnd);
		painelCadUser.add(lblNum);
		painelCadUser.add(lblTel);
		painelCadUser.add(lblSenha);
		painelCadUser.add(lblConfSenha);

		// posições e tamanho dos textFields
		txtNome.setBounds(125, 120, 320, 20);
		txtEmail.setBounds(125, 180, 320, 20);
		txtCpf.setBounds(125, 240, 320, 20);
		txtEnd.setBounds(125, 300, 320, 20);
		txtNum.setBounds(575, 300, 85, 20);
		txtTel.setBounds(125, 360, 320, 20);
		txtSenha.setBounds(198, 420, 248, 20);
		txtConfSenha.setBounds(198, 480, 248, 20);

		// colunas dos textFields
		txtNome.setColumns(10);
		txtEmail.setColumns(10);
		txtCpf.setColumns(10);
		txtEnd.setColumns(10);
		txtNum.setColumns(10);
		txtTel.setColumns(10);
		txtSenha.setColumns(10);
		txtConfSenha.setColumns(10);

		// adicionando os textFields no painel
		painelCadUser.add(txtNome);
		painelCadUser.add(txtEmail);
		painelCadUser.add(txtCpf);
		painelCadUser.add(txtEnd);
		painelCadUser.add(txtNum);
		painelCadUser.add(txtTel);
		painelCadUser.add(txtSenha);
		painelCadUser.add(txtConfSenha);

		btConfirmaCad.setBounds(45, 537, 114, 23);
		btHome.setBounds(620, 34, 89, 60);
		
		painelCadUser.add(btConfirmaCad);
		painelCadUser.add(btHome);

		btConfirmaCad.addActionListener(this);
		btHome.addActionListener(this);

	}

	public void UserToBoundary(Usuario user) {

		txtNome.setText(user.getNome());
		txtCpf.setText(user.getCpf());
		txtEmail.setText(user.getEmail());
		txtEnd.setText(user.getEndereco());
		txtNum.setText(user.getCasaNum());
		txtTel.setText(user.getTelefone());
		txtSenha.setText(user.getSenha());
		txtConfSenha.setText(user.getSenha());

	}

	public Usuario BoundaryToUser() {

		try {

			user.setNome(txtNome.getText());
			user.setCpf(txtCpf.getText());
			user.setEmail(txtEmail.getText());
			user.setEndereco(txtEnd.getText());
			user.setCasaNum(txtNum.getText());
			user.setTelefone(txtTel.getText());
			user.setSenha(txtSenha.getText());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btHome) {

			telaCadUser.dispose();
			new Janela();
		}

		if (e.getSource() == btConfirmaCad) {

			if (txtNome.getText().equals("") | txtCpf.getText().equals("") | txtEmail.getText().equals("")
					| txtEnd.getText().equals("") | txtNum.getText().equals("") | txtTel.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor, insira seus dados");
			} else if (txtSenha.getText() == null) {
				JOptionPane.showMessageDialog(null, "Digite uma senha");
			} else if (txtConfSenha.getText() == null) {
				JOptionPane.showMessageDialog(null, "Confirme sua senha");

			} else if (!txtSenha.getText().equals(txtConfSenha.getText()) | txtSenha.getText() == null
					| txtConfSenha.getText() == null) {
				JOptionPane.showMessageDialog(null, "Senhas divergentes");
			} else {
				user = BoundaryToUser();
				try {
					userControl.cadastraUser(user);

				} catch (ClassNotFoundException | SQLException e1) {

					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Usuario " + user.getNome() + "' cadastrado com sucesso!");
				txtNome.setText(null);
				txtCpf.setText(null);
				txtEmail.setText(null);
				txtEnd.setText(null);
				txtNum.setText(null);
				txtTel.setText(null);
				txtSenha.setText(null);
				txtConfSenha.setText(null);
				telaCadUser.dispose();
				new Janela();
			}
		}

	}

}
