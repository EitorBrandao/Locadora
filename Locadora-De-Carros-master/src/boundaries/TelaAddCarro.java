package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAddCarro implements ActionListener {
	JFrame addCar = new JFrame();
	JPanel painelCar = new JPanel();
	JLabel lblNomeCar = new JLabel("Carro");
	JLabel lblMarca = new JLabel("Marca");
	JLabel lblModel = new JLabel("Modelo");
	JLabel lblAno = new JLabel("Ano");
	JLabel lblCor = new JLabel("Cor");
	JLabel lblPreco = new JLabel("Preço");

	JTextField txtPreco = new JTextField();
	JComboBox cmbMarca = new JComboBox();
	JComboBox cmbCar = new JComboBox();
	JComboBox cmbModel = new JComboBox();
	JComboBox cmbAno = new JComboBox();
	JComboBox cmbCor = new JComboBox();

	JLabel lblAddCar = new JLabel("Cadastro de Veículos");
	JButton btHome = new JButton("HOME");
	JButton btConfirma = new JButton("Confirma");

	public TelaAddCarro() {

		// configs da tela
		painelCar.setLayout(null);
		addCar.setSize(800, 600);
		addCar.setVisible(true);
		addCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addCar.setResizable(false);
		addCar.getContentPane().add(painelCar);
		addCar.setLocationRelativeTo(null);

		// fontes dos labels
		lblAddCar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNomeCar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		// posições e tamanho dos labels
		lblAddCar.setBounds(275, 27, 250, 55);
		lblNomeCar.setBounds(10, 212, 46, 20);
		lblMarca.setBounds(10, 152, 46, 20);
		lblModel.setBounds(10, 272, 46, 20);
		lblAno.setBounds(10, 332, 46, 20);
		lblCor.setBounds(10, 392, 46, 20);
		lblPreco.setBounds(10, 452, 46, 20);

		// adicionando os labels no painel
		painelCar.add(lblAddCar);
		painelCar.add(lblNomeCar);
		painelCar.add(lblMarca);
		painelCar.add(lblModel);
		painelCar.add(lblAno);
		painelCar.add(lblCor);
		painelCar.add(lblPreco);

		// posições dos comboBox
		cmbMarca.setBounds(362, 150, 100, 20);
		cmbCar.setBounds(362, 215, 100, 20);
		cmbModel.setBounds(362, 280, 100, 20);
		cmbAno.setBounds(362, 345, 100, 20);
		cmbCor.setBounds(362, 410, 100, 20);
		txtPreco.setBounds(362, 475, 100, 20);

		// adicionando os comboBox no painel
		painelCar.add(cmbMarca);
		painelCar.add(cmbCar);
		painelCar.add(cmbModel);
		painelCar.add(cmbAno);
		painelCar.add(cmbCor);
		painelCar.add(txtPreco);

		txtPreco.setColumns(10);

		btHome.setBounds(620, 34, 89, 60);
		btConfirma.setBounds(10, 516, 89, 23);

		painelCar.add(btHome);
		painelCar.add(btConfirma);

		btHome.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btHome) {
			addCar.dispose();
			new Janela();
		}

	}
}
