package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import control.UsuarioControl;
import entities.Usuario;

public class TelaCadastroUser implements ActionListener {
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
	JTextField txtNum = new JTextField();
	JTextField txtConfSenha = new JTextField();

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
		lblNome.setBounds(45, 160, 46, 14);
		lblEmail.setBounds(45, 220, 98, 14);
		lblCpf.setBounds(45, 280, 46, 14);
		lblEnd.setBounds(45, 340, 70, 19);
		lblNum.setBounds(501, 340, 65, 14);
		lblTel.setBounds(45, 400, 70, 14);
		lblSenha.setBounds(45, 460, 46, 14);
		lblConfSenha.setBounds(45, 520, 135, 14);

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
		txtNome.setBounds(125, 160, 320, 20);
		txtEmail.setBounds(125, 220, 320, 20);
		txtCpf.setBounds(125, 280, 320, 20);
		txtEnd.setBounds(125, 340, 320, 20);
		txtNum.setBounds(575, 340, 85, 20);
		txtTel.setBounds(125, 400, 320, 20);
		txtSenha.setBounds(198, 460, 248, 20);
		txtConfSenha.setBounds(198, 520, 248, 20);

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

		// botões
		btHome.setBounds(575, 150, 89, 49);
		btPesquisar.setBounds(558, 518, 114, 23);
		btConfirmaCad.setBounds(558, 458, 114, 23);

		// adicionando os botoes no painel
		painelCadUser.add(btHome);
		painelCadUser.add(btPesquisar);
		painelCadUser.add(btConfirmaCad);

		// adicionando actionListener nos botoes
		btHome.addActionListener(this);
		btPesquisar.addActionListener(this);
		btConfirmaCad.addActionListener(this);

	}

	UsuarioControl userControl = new UsuarioControl();
	private final JButton btPesquisar = new JButton("Pesquisar");

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

	Usuario user = new Usuario();

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
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btConfirmaCad) {
			if (txtNome.getText().equals("") | txtCpf.getText().equals("") | txtEmail.getText().equals("")
					| txtEnd.getText().equals("") | txtNum.getText().equals("") | txtTel.getText().equals("")) {
				System.out.println("Por favor, insira seus dados");
			} else if (txtSenha.getText().equals("")) {
				System.out.println("senha vazia");
			} else if (txtConfSenha.getText().equals("")) {
				System.out.println("confirme sua senha");
			} else {
				Usuario user = BoundaryToUser();
				userControl.CadastraUser(user);
				txtNome.setText(null);
				txtCpf.setText(null);
				txtEmail.setText(null);
				txtEnd.setText(null);
				txtNum.setText(null);
				txtTel.setText(null);
				txtSenha.setText(null);
				txtConfSenha.setText(null);
			}
		}
		if (e.getSource() == btHome) {

			telaCadUser.dispose();
			new Janela();

		}
		if (e.getSource() == btPesquisar) {

			Usuario user = BoundaryToUser();
			userControl.PesquisarUser(user.getNome());
			txtCpf.setText(user.getCpf());
			txtEmail.setText(user.getEmail());
			txtEnd.setText(user.getEndereco());
			txtNum.setText(user.getCasaNum());
			txtTel.setText(user.getTelefone());
		}

	}
}
