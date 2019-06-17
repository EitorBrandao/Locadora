package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import control.CadastroUsuarioControl;
import entities.Carro;
import entities.Usuario;

public class TelaUser implements ActionListener {
	CadastroUsuarioControl userControl = new CadastroUsuarioControl();
	Usuario user = new Usuario();

	JFrame janelaAluga = new JFrame("Alugar Carro");

	JPanel painelAluga = new JPanel();
	JPanel painelEdita = new JPanel();
	JTabbedPane tabAluga = new JTabbedPane();
	JLabel lblAluguelDeCarros = new JLabel("Aluguel de Carros");

	JLabel lblMarca = new JLabel("Marca");
	JLabel lblCarro = new JLabel("Carro");
	JLabel lblModel = new JLabel("Modelo");
	JLabel lblPreco = new JLabel("Preço");
	JLabel lblCor = new JLabel("Cor");
	JLabel lblAno = new JLabel("Ano");
	JLabel lblValor = new JLabel("");

	JLabel lblNome = new JLabel("Nome");
	JLabel lblEmail = new JLabel("Email");
	JLabel lblCpf = new JLabel("CPF");
	JLabel lblEnd = new JLabel("Endereço");
	JLabel lblNum = new JLabel("Número");
	JLabel lblTel = new JLabel("Telefone");
	JLabel lblSenha = new JLabel("Senha");

	JComboBox<Carro> cmbMarca = new JComboBox<Carro>();
	JComboBox<Carro> cmbCarro = new JComboBox<Carro>();
	JComboBox<Carro> cmbModel = new JComboBox<Carro>();
	JComboBox<Carro> cmbAno = new JComboBox<Carro>();
	JComboBox<Carro> cmdCor = new JComboBox<Carro>();

	JButton btConfirmar = new JButton("Confirmar");
	JButton btHome = new JButton("HOME");
	JButton btPerfil = new JButton("Perfil");
	JButton btAtualizar = new JButton("Atualizar");
	JButton btHomeEdit = new JButton("HOME");

	private JTextField preco = new JTextField();
	private JTextField nome = new JTextField();
	private JTextField cpf = new JTextField();
	private JTextField email = new JTextField();
	private JTextField endereco = new JTextField();
	private JTextField numero = new JTextField();
	private JTextField telefone = new JTextField();
	private JTextField senha = new JTextField();

	public TelaUser() {

		painelEdita.setLayout(null);
		tabAluga.addTab("Alugar", painelAluga);
		tabAluga.addTab("Informações sobre conta", painelEdita);

		// fontes dos labels
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));

		// posições e tamanho dos labels
		lblNome.setBounds(22, 58, 80, 14);
		lblCpf.setBounds(22, 104, 80, 14);
		lblEmail.setBounds(22, 149, 80, 14);
		lblEnd.setBounds(22, 197, 80, 14);
		lblNum.setBounds(22, 247, 80, 14);
		lblTel.setBounds(22, 293, 80, 14);
		lblSenha.setBounds(22, 342, 80, 14);

		// adicionando os labels no painel
		painelEdita.add(lblNome);
		painelEdita.add(lblCpf);
		painelEdita.add(lblEmail);
		painelEdita.add(lblEnd);
		painelEdita.add(lblNum);
		painelEdita.add(lblTel);
		painelEdita.add(lblSenha);

		// posições e tamanhos dos txtFields
		nome.setBounds(139, 58, 287, 20);
		cpf.setBounds(139, 104, 287, 20);
		email.setBounds(139, 149, 287, 20);
		endereco.setBounds(139, 197, 287, 20);
		numero.setBounds(139, 247, 287, 20);
		telefone.setBounds(139, 293, 287, 20);
		senha.setBounds(139, 342, 287, 20);

		nome.setColumns(10);
		cpf.setColumns(10);
		email.setColumns(10);
		endereco.setColumns(10);
		numero.setColumns(10);
		telefone.setColumns(10);
		senha.setColumns(10);

		// adicionando os txtField no painel
		painelEdita.add(nome);
		painelEdita.add(cpf);
		painelEdita.add(endereco);
		painelEdita.add(numero);
		painelEdita.add(telefone);
		painelEdita.add(senha);
		painelEdita.add(email);

		// adicionando os botões
		painelEdita.add(btPerfil);
		painelEdita.add(btAtualizar);
		painelEdita.add(btHomeEdit);

		// posições e tamanho dos botoes
		btPerfil.setBounds(22, 440, 100, 23);
		btAtualizar.setBounds(337, 440, 100, 23);
		btHomeEdit.setBounds(620, 34, 89, 60);

		// tratamento dos botões
		btPerfil.addActionListener(this);
		btAtualizar.addActionListener(this);
		btHomeEdit.addActionListener(this);

		// configs da tela
		janelaAluga.setSize(800, 600);
		janelaAluga.setVisible(true);
		janelaAluga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaAluga.setResizable(false);
		janelaAluga.setLocationRelativeTo(null);
		painelAluga.setLayout(null);
		janelaAluga.getContentPane().add(tabAluga);

		// fontes dos labels
		lblAluguelDeCarros.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		// posições e tamanho dos labels
		lblAluguelDeCarros.setBounds(275, 27, 250, 55);
		lblMarca.setBounds(10, 157, 46, 14);
		lblCarro.setBounds(10, 215, 46, 14);
		lblModel.setBounds(10, 276, 46, 14);
		lblAno.setBounds(10, 338, 46, 14);
		lblCor.setBounds(10, 402, 46, 14);
		lblPreco.setBounds(10, 465, 46, 28);
		lblValor.setBounds(405, 498, 46, 14);

		// adicionando os labels no painel
		painelAluga.add(lblAluguelDeCarros);
		painelAluga.add(lblMarca);
		painelAluga.add(lblCarro);
		painelAluga.add(lblModel);
		painelAluga.add(lblAno);
		painelAluga.add(lblCor);
		painelAluga.add(lblValor);
		painelAluga.add(lblPreco);

		// posições e tamanho dos comboBox
		cmbMarca.setBounds(362, 150, 100, 20);
		cmbCarro.setBounds(362, 215, 100, 20);
		cmbModel.setBounds(362, 280, 100, 20);
		cmbAno.setBounds(362, 345, 100, 20);
		cmdCor.setBounds(362, 410, 100, 20);
		preco.setBounds(362, 475, 100, 20);
		preco.setEditable(false);

		// adicionando os comboBox no painel
		painelAluga.add(cmbMarca);
		painelAluga.add(cmbCarro);
		painelAluga.add(cmbModel);
		painelAluga.add(cmbAno);
		painelAluga.add(cmdCor);
		painelAluga.add(preco);

		// botões
		btHome.setBounds(620, 34, 89, 60);
		btConfirmar.setBounds(10, 509, 132, 23);

		// adicionando os botoes no painel
		painelAluga.add(btHome);
		painelAluga.add(btConfirmar);

		// adicionando actionListener nos botoes
		btHome.addActionListener(this);
		btHomeEdit.addActionListener(this);
		btPerfil.addActionListener(this);
	}

	public Usuario boundaryToUser() {

		try {

			user.setNome(nome.getText());
			user.setCpf(cpf.getText());
			user.setEmail(email.getText());
			user.setEndereco(endereco.getText());
			user.setCasaNum(numero.getText());
			user.setTelefone(telefone.getText());
			user.setSenha(senha.getText());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btHome) {
			janelaAluga.dispose();
			new Janela();

		}
		if (e.getSource() == btHomeEdit) {
			janelaAluga.dispose();
			new Janela();

		}
		if (e.getSource() == btAtualizar) {
			user = boundaryToUser();
			try {
				userControl.cadastraUser(user);
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btConfirmar) {
		}
		if (e.getSource() == btPerfil) {

			try {

				userControl.pesquisarUser(user);
				nome.setText(user.getNome());
				cpf.setText(user.getCpf());
				email.setText(user.getEmail());
				endereco.setText(user.getEndereco());
				numero.setText(user.getCasaNum());
				telefone.setText(user.getTelefone());
				senha.setText(user.getSenha());

			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
