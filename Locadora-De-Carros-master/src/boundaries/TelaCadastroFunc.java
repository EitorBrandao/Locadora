package boundaries;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class TelaCadastroFunc {

	
	JPanel painelCadFunc = new JPanel ();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public TelaCadastroFunc () {
		painelCadFunc.setLayout(null);
		
		JLabel lblNomeFunc = new JLabel("Nome");
		lblNomeFunc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeFunc.setBounds(10, 120, 91, 14);
		painelCadFunc.add(lblNomeFunc);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(10, 240, 91, 14);
		painelCadFunc.add(lblId);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(10, 360, 91, 14);
		painelCadFunc.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(153, 119, 86, 20);
		painelCadFunc.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 239, 86, 20);
		painelCadFunc.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 479, 86, 20);
		painelCadFunc.add(textField_2);
		
		JLabel lblConfSenha = new JLabel("Confirme sua senha");
		lblConfSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConfSenha.setBounds(10, 480, 120, 14);
		painelCadFunc.add(lblConfSenha);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 359, 86, 20);
		painelCadFunc.add(textField_3);
		
		JLabel lblCadastroFunc = new JLabel("Cadastro de Funcion\u00E1rios");
		lblCadastroFunc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCadastroFunc.setBounds(300, 30, 257, 25);
		painelCadFunc.add(lblCadastroFunc);
		
		
		
	}
}
