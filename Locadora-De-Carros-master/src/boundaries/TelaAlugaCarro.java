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

public class TelaAlugaCarro implements ActionListener {

	JPanel painelAluga = new JPanel();
	JFrame janelaAluga = new JFrame("Alugar Carro");
	JLabel lblAluguelDeCarros = new JLabel("Aluguel de Carros");
	JLabel lblMarca = new JLabel("Marca");
	JLabel lblCarro = new JLabel("Carro");
	JLabel lblModel = new JLabel("Modelo");
	JLabel lblPreco = new JLabel("Preço");
	JLabel lblCor = new JLabel("Cor");
	JLabel lblAno = new JLabel("Ano");
	JLabel lblValor = new JLabel("");
	JComboBox cmbMarca = new JComboBox();
	JComboBox cmbCarro = new JComboBox();
	JComboBox cmbModel = new JComboBox();
	JComboBox cmbAno = new JComboBox();
	JComboBox cmdCor = new JComboBox();
	JTextField txtpreco = new JTextField();
	JButton btConfCar = new JButton("Confirmar");
	JButton btHome = new JButton("HOME");

	public TelaAlugaCarro() {

		// configs da tela
		janelaAluga.setSize(800, 600);
		janelaAluga.setVisible(true);
		janelaAluga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaAluga.add(painelAluga);
		janelaAluga.setResizable(false);
		janelaAluga.setLocationRelativeTo(null);
		painelAluga.setLayout(null);

		// fontes dos labels
		lblAluguelDeCarros.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		// posições e tamanho dos labels
		lblAluguelDeCarros.setBounds(275, 27, 250, 55);
		lblMarca.setBounds(10, 157, 46, 14);
		lblCarro.setBounds(10, 215, 46, 14);
		lblModel.setBounds(10, 276, 46, 14);
		lblAno.setBounds(10, 338, 46, 14);
		lblCor.setBounds(10, 402, 46, 14);
		lblPreco.setBounds(10, 465, 46, 28);
		lblValor.setBounds(405, 498, 46, 14);

		// adicionando os labels no painel
		painelAluga.add(lblAluguelDeCarros);
		painelAluga.add(lblMarca);
		painelAluga.add(lblCarro);
		painelAluga.add(lblModel);
		painelAluga.add(lblAno);
		painelAluga.add(lblCor);
		painelAluga.add(lblValor);
		painelAluga.add(lblPreco);

		// posições e tamanho dos comboBox
		cmbMarca.setBounds(362, 150, 100, 20);
		cmbCarro.setBounds(362, 215, 100, 20);
		cmbModel.setBounds(362, 280, 100, 20);
		cmbAno.setBounds(362, 345, 100, 20);
		cmdCor.setBounds(362, 410, 100, 20);
		txtpreco.setBounds(362, 475, 100, 20);
		txtpreco.setEditable(false);
		

		// adicionando os comboBox no painel
		painelAluga.add(cmbMarca);
		painelAluga.add(cmbCarro);
		painelAluga.add(cmbModel);
		painelAluga.add(cmbAno);
		painelAluga.add(cmdCor);
		painelAluga.add(txtpreco);
		
		// botões
		btHome.setBounds(620, 34, 89, 60);
		btConfCar.setBounds(10, 528, 132, 23);

		// adicionando os botoes no painel
		painelAluga.add(btHome);
		painelAluga.add(btConfCar);

		// adicionando actionListener nos botoes
		btHome.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btHome) {
			janelaAluga.dispose();
			new Janela();

		}

	}

}
