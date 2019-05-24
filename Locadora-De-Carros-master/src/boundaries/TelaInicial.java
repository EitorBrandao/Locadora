package boundaries;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import boundaries.TelaCadastro;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaInicial extends JFrame {

	JFrame janela = new JFrame("Locadora de Carros");
	JPanel login = new JPanel(new BorderLayout());
	JPanel menu = new JPanel();
	JPanel conteudo = new JPanel();
	Button btnCad = new Button("Cadastrar-se");
	Button btnLog = new Button("Login");
	Label lblCarx = new Label("CarX");

	public TelaInicial() {

		janela.setContentPane(login);
		janela.setVisible(true);
		janela.setSize(800, 600);
		janela.setLocation(600, 200);
		login.add(conteudo, BorderLayout.CENTER);
		login.add(menu, BorderLayout.NORTH);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnCad.setFont(new Font("Eras Demi ITC", Font.PLAIN, 18));
		btnCad.setBounds(261, 10, 118, 30);
		menu.add(btnCad);
		btnCad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastro tela = new TelaCadastro(conteudo);
			}
		});

		btnLog.setFont(new Font("Eras Demi ITC", Font.PLAIN, 18));
		btnLog.setBounds(384, 10, 58, 30);
		menu.add(btnLog);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFunc cad = new CadastroFunc(conteudo);
			}
		});

		lblCarx.setFont(new Font("Rockwell", Font.PLAIN, 27));
		lblCarx.setBounds(447, 5, 75, 41);
		menu.add(lblCarx);

	};

	public static void main(String[] args) {
		new TelaInicial();
	}

}
