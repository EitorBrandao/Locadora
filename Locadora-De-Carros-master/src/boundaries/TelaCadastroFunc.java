package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroFunc implements ActionListener {

	JFrame telaCadFunc = new JFrame("Cadastro de Funcion�rios");
	JPanel painelCadFunc = new JPanel();
	
	JTextField txtNome = new JTextField();
	JTextField txtId = new JTextField();
	JTextField txtConfSenha = new JTextField();
	JTextField txtSenha = new JTextField();
	
	JLabel lblCadastroFunc = new JLabel("Cadastro de Funcion�rios");
	JLabel lblNomeFunc = new JLabel("Nome");
	JLabel lblId = new JLabel("ID");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfSenha = new JLabel("Confirme sua senha");
	
	JButton btHome = new JButton("HOME");
	JButton btConfCadFunc = new JButton("Confirmar");

	public TelaCadastroFunc() {

		// configs da tela
		telaCadFunc.setSize(507, 334);
		telaCadFunc.setVisible(true);
		telaCadFunc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadFunc.setResizable(false);
		telaCadFunc.setLocationRelativeTo(null);
		telaCadFunc.getContentPane().add(painelCadFunc);
		telaCadFunc.add(painelCadFunc);
		painelCadFunc.setLayout(null);

		// fontes dos labels
		lblCadastroFunc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeFunc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));

		// posi��es dos labels
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

		// posi��es dos textFields
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

		// bot�es
		btHome.setBounds(400, 10, 100, 30);
		btConfCadFunc.setBounds(400, 240, 100, 30);

		//adicionando os botoes no painel
		painelCadFunc.add(btHome);
		painelCadFunc.add(btConfCadFunc);

		//adicionando actionListener nos botoes
		btHome.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btHome) {

			telaCadFunc.dispose();
			new Janela();
		}

	}
}
