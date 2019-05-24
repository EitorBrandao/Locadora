package boundaries;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import control.CadastroControl;
import entities.Usuario;

public class TelaCadastro extends JFrame {
	Usuario user = new Usuario();

	JTextField txtNome = new JTextField();
	JTextField txtCpf = new JTextField();
	JTextField txtEmail = new JTextField();
	JTextField txtEnd = new JTextField();
	JTextField txtTel = new JTextField();
	JTextField txtSenha = new JTextField();
	JTextField txtConfSenha = new JTextField();

	JLabel lblNome = new JLabel("Nome");
	JLabel lblCpf = new JLabel("CPF");
	JLabel lblEmail = new JLabel("Email");
	JLabel lblEndereco = new JLabel("Endereço");
	JLabel lblTelefone = new JLabel("Telefone");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfSenha = new JLabel("Confirme sua senha");

	JButton jbSalvar = new JButton("Salvar");
	JButton jbPesquisar = new JButton("Pesquisar");

	public TelaCadastro(JPanel conteudo) {

		JPanel panelCad = new JPanel();
		CadastroControl c = new CadastroControl();

		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblNome.setBounds(10, 51, 72, 14);
		panelCad.add(lblNome);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblCpf.setBounds(10, 124, 72, 14);
		panelCad.add(lblCpf);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblEmail.setBounds(10, 197, 72, 14);
		panelCad.add(lblEmail);
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblEndereco.setBounds(10, 274, 72, 14);
		panelCad.add(lblEndereco);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblTelefone.setBounds(10, 345, 72, 14);
		panelCad.add(lblTelefone);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));

		lblSenha.setBounds(10, 424, 72, 14);
		panelCad.add(lblSenha);

		txtNome.setBounds(143, 51, 221, 20);
		panelCad.add(txtNome);
		txtNome.setColumns(10);

		txtCpf.setColumns(10);
		txtCpf.setBounds(143, 121, 221, 20);
		panelCad.add(txtCpf);

		txtEmail.setColumns(10);
		txtEmail.setBounds(143, 194, 221, 20);
		panelCad.add(txtEmail);

		txtEnd.setColumns(10);
		txtEnd.setBounds(143, 271, 221, 20);
		panelCad.add(txtEnd);

		txtTel.setColumns(10);
		txtTel.setBounds(143, 342, 221, 20);
		panelCad.add(txtTel);

		txtSenha.setColumns(10);
		txtSenha.setBounds(143, 421, 221, 20);
		panelCad.add(txtSenha);

		// lbl senha e confere senha
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfSenha.setBounds(10, 486, 123, 14);
		panelCad.add(lblConfSenha);
		txtConfSenha.setColumns(10);
		txtConfSenha.setBounds(143, 483, 221, 20);
		panelCad.add(txtConfSenha);

		// botao salvar
		jbSalvar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jbSalvar.setSize(184, 52);
		jbSalvar.setLocation(528, 50);
		panelCad.add(jbSalvar);

		// botao pesquisar
		jbPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jbPesquisar.setSize(184, 52);
		jbPesquisar.setLocation(528, 450);

		panelCad.add(jbPesquisar);

		conteudo.removeAll();
		conteudo.add(panelCad);
		conteudo.revalidate();
		conteudo.repaint();

	}

	public static void main(String[] args) {
	}



//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		if (e.getSource() == jbSalvar) {
//
//			user.setNome(txtNome.getText());
//			user.setCpf(txtCpf.getText());
//			user.setEmail(txtEmail.getText());
//			user.setEndereco(txtEnd.getText());
//			user.setTelefone(txtTel.getText());
//			user.setSenha(txtSenha.getText());
//			usuarioToBoundary(user);
//			boundaryToUsuario();
//			c.adicionar(user);
//
//		} else if (e.getSource() == jbPesquisar) {
//
//			c.pesquisarPorNome(txtNome.getText());
//			usuarioToBoundary(user);
//			boundaryToUsuario();
//		}
//	}

//	public void usuarioToBoundary(Usuario user) {
//
//		txtNome.setText(user.getNome());
//		txtCpf.setText(user.getCpf());
//		txtEmail.setText(user.getEmail());
//		txtEnd.setText(user.getEndereco());
//		txtTel.setText(user.getTelefone());
//		txtSenha.setText(user.getSenha());
//
//	}
//
//	public Usuario boundaryToUsuario() {
//
//		try {
//
//			user.setNome(txtNome.getText());
//			user.setCpf(txtCpf.getText());
//			user.setEmail(txtEmail.getText());
//			user.setEndereco(txtEnd.getText());
//			user.setTelefone(txtTel.getText());
//			user.setSenha(txtSenha.getText());
//
//		} catch (NumberFormatException e1) {
//			e1.printStackTrace();
//		} catch (ParseException e1) {
//			e1.printStackTrace();
//		}
//		return user;
//
//	}

}