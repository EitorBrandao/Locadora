package boundaries;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entities.Funcionario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroFunc { 
	JFrame janelaFunc = new JFrame("Cadastro de Funcionários");

	JLabel lblId = new JLabel("ID");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfirmeSuaSenha = new JLabel("Confirme sua senha");

	JTextField txtId = new JTextField();
	JTextField textSenha = new JTextField();
	JTextField textSenha2 = new JTextField();

	public CadastroFunc() {

		janelaFunc.setSize(800, 600);
		janelaFunc.getContentPane().setLayout(null);

		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(10, 96, 46, 14);
		janelaFunc.getContentPane().add(lblId);

		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(10, 197, 46, 14);
		janelaFunc.getContentPane().add(lblSenha);

		lblConfirmeSuaSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmeSuaSenha.setBounds(10, 308, 136, 14);
		janelaFunc.getContentPane().add(lblConfirmeSuaSenha);

		txtId.setBounds(174, 95, 86, 20);
		janelaFunc.getContentPane().add(txtId);
		txtId.setColumns(10);

		textSenha.setColumns(10);
		textSenha.setBounds(174, 196, 86, 20);
		janelaFunc.getContentPane().add(textSenha);

		textSenha2.setColumns(10);
		textSenha2.setBounds(174, 307, 86, 20);
		janelaFunc.getContentPane().add(textSenha2);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionario f = new Funcionario();
				// f.setId(txtId.getText());
				f.setSenha(textSenha.getText());
				if (textSenha.getText().equals("") | textSenha2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Insira a senha e confirme a senha");
				} else {
					if (textSenha.getText().equals(textSenha2.getText())) {
						JOptionPane.showMessageDialog(null, "Usuario teoricamente salvo no sistema");
					} else {
						JOptionPane.showMessageDialog(null, "As senhas não coicidem");
					}
				}
			}
		});
		btnSalvar.setBounds(605, 94, 89, 23);
		janelaFunc.getContentPane().add(btnSalvar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtId.setText(null);
				textSenha.setText(null);
				textSenha2.setText(null);
			}
		});
		btnLimpar.setBounds(605, 195, 89, 23);
		janelaFunc.getContentPane().add(btnLimpar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				janelaFunc.setVisible(false);
			}
		});
		btnCancelar.setBounds(605, 306, 89, 23);
		janelaFunc.getContentPane().add(btnCancelar);

		janelaFunc.setVisible(true);
	}

	public static void main(String[] args) {

		new CadastroFunc();

	}
}