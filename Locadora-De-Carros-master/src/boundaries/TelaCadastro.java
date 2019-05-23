package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.CadastroControl;
import entities.Usuario;

public class TelaCadastro extends JFrame implements ActionListener{
	Usuario user = new Usuario ();
	JFrame telaCad = new JFrame();

	JTextField txtNome =  new JTextField ();
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
	
	JButton jbSalvar = new JButton ("Salvar");
	JButton jbPesquisar = new JButton ("Pesquisar");
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()== jbSalvar) {
		
			
			CadastroControl c = new CadastroControl();
			user.setNome(txtNome.getText());
			user.setCpf(txtCpf.getText());
			user.setEmail(txtEmail.getText());
			user.setEndereco(txtEnd.getText());
			user.setTelefone(txtTel.getText());
			user.setSenha(txtSenha.getText());
			
			c.adicionar(user);
			telaCad.repaint();
		} else if (e.getSource()== jbPesquisar){ 
			
			
			CadastroControl c = new CadastroControl();
			c.pesquisarPorNome(user);
			
		}
		
	}
	
	public TelaCadastro() {
		
		
		telaCad.getContentPane().setLayout(null);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		lblNome.setBounds(10, 51, 72, 14);
		telaCad.getContentPane().add(lblNome);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		lblCpf.setBounds(10, 124, 72, 14);
		telaCad.getContentPane().add(lblCpf);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		lblEmail.setBounds(10, 197, 72, 14);
		telaCad.getContentPane().add(lblEmail);
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		lblEndereco.setBounds(10, 274, 72, 14);
		telaCad.getContentPane().add(lblEndereco);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
	
		lblTelefone.setBounds(10, 345, 72, 14);
		telaCad.getContentPane().add(lblTelefone);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		lblSenha.setBounds(10, 424, 72, 14);
		telaCad.getContentPane().add(lblSenha);
		
		
		txtNome.setBounds(143, 51, 221, 20);
		telaCad.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		
		txtCpf.setColumns(10);
		txtCpf.setBounds(143, 121, 221, 20);
		telaCad.getContentPane().add(txtCpf);
		
		
		txtEmail.setColumns(10);
		txtEmail.setBounds(143, 194, 221, 20);
		telaCad.getContentPane().add(txtEmail);
		
		
		txtEnd.setColumns(10);
		txtEnd.setBounds(143, 271, 221, 20);
		telaCad.getContentPane().add(txtEnd);
		
		
		txtTel.setColumns(10);
		txtTel.setBounds(143, 342, 221, 20);
		telaCad.getContentPane().add(txtTel);
		
	
		txtSenha.setColumns(10);
		txtSenha.setBounds(143, 421, 221, 20);
		telaCad.getContentPane().add(txtSenha);
		
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfSenha.setBounds(10, 486, 123, 14);
		telaCad.getContentPane().add(lblConfSenha);
		txtConfSenha.setColumns(10);
		txtConfSenha.setBounds(143, 483, 221, 20);
		telaCad.getContentPane().add(txtConfSenha);
		
		jbSalvar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jbSalvar.setSize(184, 52);
		jbSalvar.setLocation(528, 50);
		telaCad.getContentPane().add(jbSalvar);
		jbSalvar.addActionListener(this);
		jbPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jbPesquisar.setSize(184, 52);
		jbPesquisar.setLocation(528, 450);
		
		telaCad.getContentPane().add(jbPesquisar);
		
		
		telaCad.setVisible(true);
		telaCad.setSize(800, 600);
		telaCad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		
		
	
	
	}
	
	
	public static void main(String[] args) {
		new TelaCadastro();
	}



}