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

import control.CadastroFuncControl;
import entities.Funcionario;

public class TelaCadastroFunc implements ActionListener {

	CadastroFuncControl funcControl = new CadastroFuncControl();
	Funcionario func = new Funcionario();
	JFrame telaCadFunc = new JFrame("Cadastro de Funcionários");
	JPanel painelCadFunc = new JPanel();

	JTextField txtNome = new JTextField();
	JTextField txtId = new JTextField();
	JTextField txtConfSenha = new JTextField();
	JTextField txtSenha = new JTextField();

	JLabel lblCadastroFunc = new JLabel("Cadastro de Funcionários");
	JLabel lblNomeFunc = new JLabel("Nome");
	JLabel lblId = new JLabel("ID");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfSenha = new JLabel("Confirme sua senha");

	JButton btHome = new JButton("HOME");
	JButton btConfCadFunc = new JButton("Confirmar");
	JButton btPesq = new JButton("Pesquisar");

	public TelaCadastroFunc() {

		// configs da tela
		telaCadFunc.setSize(507, 334);
		telaCadFunc.setVisible(true);
		telaCadFunc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadFunc.setResizable(false);
		telaCadFunc.setLocationRelativeTo(null);
		telaCadFunc.getContentPane().add(painelCadFunc);
		telaCadFunc.getContentPane().add(painelCadFunc);
		painelCadFunc.setLayout(null);

		// fontes dos labels
		lblCadastroFunc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeFunc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));

		// posições dos labels
		lblCadastroFunc.setBounds(120, 10, 257, 25);
		lblNomeFunc.setBounds(10, 60, 91, 14);
		lblId.setBounds(10, 120, 91, 14);
		lblSenha.setBounds(10, 180, 91, 14);
		lblConfSenha.setBounds(10, 240, 120, 14);

		// adicionando os labels no painel
		painelCadFunc.add(lblCadastroFunc);
		painelCadFunc.add(lblNomeFunc);
		painelCadFunc.add(lblId);
		painelCadFunc.add(lblSenha);
		painelCadFunc.add(lblConfSenha);

		// posições dos textFields
		txtNome.setBounds(153, 60, 200, 20);
		txtId.setBounds(153, 120, 75, 20);
		txtSenha.setBounds(153, 180, 100, 20);
		txtConfSenha.setBounds(153, 240, 100, 20);

		// colunas dos textFields
		txtNome.setColumns(10);
		txtId.setColumns(10);
		txtSenha.setColumns(10);
		txtConfSenha.setColumns(10);

		// adicionando os textFields no painel
		painelCadFunc.add(txtNome);
		painelCadFunc.add(txtId);
		painelCadFunc.add(txtSenha);
		painelCadFunc.add(txtConfSenha);

		// botões
		btHome.setBounds(400, 10, 100, 30);
		btConfCadFunc.setBounds(400, 174, 100, 30);
		btPesq.setBounds(400, 238, 100, 30);

		// adicionando os botoes no painel
		painelCadFunc.add(btHome);
		painelCadFunc.add(btConfCadFunc);
		painelCadFunc.add(btPesq);

		// adicionando actionListener nos botoes
		btHome.addActionListener(this);
		btConfCadFunc.addActionListener(this);
		btPesq.addActionListener(this);
	}

	public void funcToBoundary(Funcionario func) {

		txtNome.setText(func.getNome());
		txtId.setText(String.format("%d", func.getId()));
		txtSenha.setText(func.getSenha());
		txtConfSenha.setText(func.getSenha());

	}

	public Funcionario boundaryToFunc() {

		try {

			func.setNome(txtNome.getText());
			func.setId(Integer.parseInt(txtId.getText()));
			func.setSenha(txtSenha.getText());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return func;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btHome) {

			telaCadFunc.dispose();
			new Janela();
		}
		if (e.getSource() == btConfCadFunc) {
			if (txtNome.getText().equals("") | txtId.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor, insira seus dados");
			} else if (txtSenha.getText() == null) {
				JOptionPane.showMessageDialog(null, "Digite uma senha");
			} else if (txtConfSenha.getText() == null) {
				JOptionPane.showMessageDialog(null, "Confirme sua senha");
			} else if (!txtSenha.getText().equals(txtConfSenha.getText()) | txtSenha.getText() == null
					| txtConfSenha.getText() == null) {
				JOptionPane.showMessageDialog(null, "Senhas divergentes");
			} else {
				Funcionario func = boundaryToFunc();

				try {
					funcControl.inserirFuncionario(func);
					JOptionPane.showMessageDialog(null, "Funcionario " + func.getNome() + " cadastrado com sucesso");
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}

				txtNome.setText(null);
				txtId.setText(null);
				txtSenha.setText(null);
				txtConfSenha.setText(null);
				telaCadFunc.dispose();
				new Janela();
			}
		}
		if (e.getSource() == btPesq) {
			funcToBoundary(func);
		}
	}
}
