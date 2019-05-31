package boundaries;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class Janela implements ActionListener {

	JFrame principal = new JFrame("CarX");

	JTabbedPane tLog = new JTabbedPane(JTabbedPane.TOP);
	LoginUser logUser = new LoginUser();
	LoginFunc logFunc = new LoginFunc();

	public Janela() {

		principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		principal.setResizable(false);
		principal.setSize(507, 334);
		principal.setVisible(true);
		principal.setResizable(false);
		principal.getContentPane().setLayout(null);
		principal.setLocationRelativeTo(null);

		tLog.setBounds(10, 11, 450, 262);
		tLog.addTab("Usuário", logUser.loginUser);
		tLog.addTab("Funcionário", logFunc.loginFunc);
		principal.add(tLog);

		logUser.btCad.addActionListener(this);
		logUser.btConfirma.addActionListener(this);
		logFunc.btCad.addActionListener(this);
		logFunc.btConfirma.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// caso o botao clicado seja o confirma do Usuario
		if (e.getSource() == logUser.btCad) {

			new TelaCadastroUser();
			principal.dispose();

		}
		if (e.getSource() == logUser.btConfirma) {
			if (logUser.txtLog.getText().equals("123") && logUser.txtSenha.getText().equals("123")) {
				principal.dispose();
				new TelaAlugaCarro();

			} else if (logUser.txtLog.getText().equals("") || logUser.txtSenha.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Digite o usuario e senha");
			}
		}
		if (e.getSource() == logFunc.btCad) {

			new TelaCadastroFunc();
			principal.dispose();

		}
		// caso o botao clicado seja o confirma do funcionario
		if (e.getSource() == logFunc.btConfirma) {
			if (logFunc.txtId.getText().equals("123") | logFunc.txtSenha.getText().equals("123")) {
				new TelaAddCarro();
				principal.dispose();
				
			} else if (logUser.txtLog.getText().equals("") || logUser.txtSenha.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Digite o usuario e senha");
			}
		}

	}

}
