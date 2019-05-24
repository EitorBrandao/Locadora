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
import javax.swing.JPanel;

public class CadastroFunc {

	JLabel lblId = new JLabel("ID");
	JLabel lblSenha = new JLabel("Senha");
	JLabel lblConfirmeSuaSenha = new JLabel("Confirme sua senha");

	JTextField txtId = new JTextField();
	JTextField textSenha = new JTextField();
	JTextField textSenha2 = new JTextField();

	public CadastroFunc(JPanel conteudo) {

		JPanel panelCadFunc = new JPanel();

		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(21, 27, 14, 17);
		panelCadFunc.add(lblId);

		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(21, 103, 38, 17);
		panelCadFunc.add(lblSenha);

		lblConfirmeSuaSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfirmeSuaSenha.setBounds(21, 182, 120, 17);
		panelCadFunc.add(lblConfirmeSuaSenha);

		txtId.setBounds(166, 27, 86, 20);
		panelCadFunc.add(txtId);
		txtId.setColumns(10);

		textSenha.setColumns(10);
		textSenha.setBounds(166, 182, 86, 20);
		panelCadFunc.add(textSenha);

		textSenha2.setColumns(10);
		textSenha2.setBounds(166, 103, 86, 20);
		panelCadFunc.add(textSenha2);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionario f = new Funcionario();
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
		panelCadFunc.add(btnSalvar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtId.setText(null);
				textSenha.setText(null);
				textSenha2.setText(null);
			}
		});
		panelCadFunc.add(btnLimpar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCadFunc.setVisible(false);
			}
		});
		btnCancelar.setBounds(324, 177, 97, 31);
		panelCadFunc.add(btnCancelar);

		conteudo.removeAll();
		conteudo.add(panelCadFunc);
		conteudo.revalidate();
		conteudo.repaint();

	}

	public static void main(String[] args) {
	}
}