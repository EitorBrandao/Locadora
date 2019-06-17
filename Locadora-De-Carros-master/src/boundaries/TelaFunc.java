package boundaries;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import control.CadastraCarroControl;
import entities.Carro;

public class TelaFunc implements ActionListener {
	CadastraCarroControl carCont = new CadastraCarroControl();
	Carro car = new Carro();
	JFrame addCar = new JFrame();
	JPanel painelCar = new JPanel();
	JPanel painelEdit = new JPanel();
	JTabbedPane tabFunc = new JTabbedPane();

	JLabel cadlblMarca = new JLabel("Marca");
	JLabel cadlblNomeCarro = new JLabel("Carro");
	JLabel cadlblModelo = new JLabel("Modelo");
	JLabel cadlblAno = new JLabel("Ano");
	JLabel cadlblCor = new JLabel("Cor");
	JLabel cadlblPreco = new JLabel("Preço");

	JLabel editlblMarca = new JLabel("Marca");
	JLabel editlblCarro = new JLabel("Carro");
	JLabel editlblModelo = new JLabel("Modelo");
	JLabel editlblAno = new JLabel("Ano");
	JLabel editlblCor = new JLabel("Cor");
	JLabel editlblPreco = new JLabel("Preço");

	JLabel lblAddCar = new JLabel("Cadastro de Veículos");
	JLabel lblEditCar = new JLabel("Editar Veículos");

	JButton btHome = new JButton("HOME");
	JButton btHomeEdit = new JButton("HOME");
	JButton btConfirma = new JButton("Confirma");
	JButton btPesquisa = new JButton("Pesquisar");
	JButton btEdit = new JButton("Editar");

	JTextField cadCor = new JTextField();
	JTextField cadAno = new JTextField();
	JTextField cadModelo = new JTextField();
	JTextField cadCarro = new JTextField();
	JTextField cadMarca = new JTextField();
	JTextField cadPreco = new JTextField();

	JTextField editMarca = new JTextField();
	JTextField editCarro = new JTextField();
	JTextField editModelo = new JTextField();
	JTextField editAno = new JTextField();
	JTextField editCor = new JTextField();
	JTextField editPreco = new JTextField();

	public TelaFunc() {

		// config da janela
		painelCar.setLayout(null);
		painelEdit.setLayout(null);
		addCar.setSize(800, 600);
		addCar.setVisible(true);
		addCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addCar.setResizable(false);
		addCar.setLocationRelativeTo(null);
		addCar.getContentPane().add(tabFunc);

		// adicionando o CADASTRAR na tela
		tabFunc.addTab("Cadastrar Carro", painelCar);

		// fontes dos labels
		lblAddCar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cadlblNomeCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cadlblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cadlblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cadlblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cadlblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cadlblPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		// posições e tamanho dos labels
		lblAddCar.setBounds(275, 27, 250, 55);
		cadlblMarca.setBounds(10, 115, 46, 20);
		cadlblNomeCarro.setBounds(10, 180, 46, 20);
		cadlblModelo.setBounds(10, 245, 46, 20);
		cadlblAno.setBounds(10, 310, 46, 20);
		cadlblCor.setBounds(10, 375, 46, 20);
		cadlblPreco.setBounds(10, 440, 46, 20);

		// adicionando os labels no painel
		painelCar.add(lblAddCar);
		painelCar.add(cadlblNomeCarro);
		painelCar.add(cadlblMarca);
		painelCar.add(cadlblModelo);
		painelCar.add(cadlblAno);
		painelCar.add(cadlblCor);
		painelCar.add(cadlblPreco);
		painelCar.add(cadPreco);

		// posições e tamanhos dos txtFields
		cadMarca.setBounds(362, 115, 100, 20);
		cadCarro.setBounds(362, 180, 100, 20);
		cadModelo.setBounds(362, 245, 100, 20);
		cadAno.setBounds(362, 310, 100, 20);
		cadCor.setBounds(362, 375, 100, 20);
		cadPreco.setBounds(362, 440, 100, 20);

		cadCor.setColumns(10);
		cadPreco.setColumns(10);
		cadMarca.setColumns(10);
		cadCarro.setColumns(10);
		cadModelo.setColumns(10);
		cadAno.setColumns(10);

		// adicionando os txtField no painel
		painelCar.add(cadCor);
		painelCar.add(cadAno);
		painelCar.add(cadModelo);
		painelCar.add(cadCarro);
		painelCar.add(cadMarca);

		// posições e tamanho dos botoes
		btHome.setBounds(620, 34, 89, 60);
		btConfirma.setBounds(10, 509, 100, 23);

		// adicionando os botões "Confirma" e "Home"
		painelCar.add(btHome);
		painelCar.add(btConfirma);

		// tratamento dos botões
		btHome.addActionListener(this);
		btConfirma.addActionListener(this);

		// adicinando o EDITAR na tela
		tabFunc.add("Editar Carro", painelEdit);

		// fontes dos labels
		lblEditCar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		editlblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		editlblCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		editlblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		editlblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		editlblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		editlblPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		// posições e tamanho dos labels
		lblEditCar.setBounds(325, 27, 250, 55);
		editlblMarca.setBounds(10, 115, 46, 20);
		editlblCarro.setBounds(10, 180, 46, 20);
		editlblModelo.setBounds(10, 245, 46, 20);
		editlblAno.setBounds(10, 310, 46, 20);
		editlblCor.setBounds(10, 375, 46, 20);
		editlblPreco.setBounds(10, 440, 46, 20);

		// adicionando os labels no painel
		painelEdit.add(lblEditCar);
		painelEdit.add(editlblMarca);
		painelEdit.add(editlblCarro);
		painelEdit.add(editlblModelo);
		painelEdit.add(editlblAno);
		painelEdit.add(editlblCor);
		painelEdit.add(editlblPreco);

		editCarro.setColumns(10);
		editMarca.setColumns(10);
		editModelo.setColumns(10);
		editAno.setColumns(10);
		editCor.setColumns(10);
		editPreco.setColumns(10);

		// posições e tamanhos dos txtFields
		editMarca.setBounds(362, 115, 100, 20);
		editCarro.setBounds(362, 180, 100, 20);
		editModelo.setBounds(362, 245, 100, 20);
		editAno.setBounds(362, 310, 100, 20);
		editCor.setBounds(362, 375, 100, 20);
		editPreco.setBounds(362, 440, 100, 20);

		// adicionando os txtField no painel
		painelEdit.add(editMarca);
		painelEdit.add(editCarro);
		painelEdit.add(editModelo);
		painelEdit.add(editAno);
		painelEdit.add(editCor);
		painelEdit.add(editPreco);

		// posições e tamanho dos botoes
		btPesquisa.setBounds(10, 509, 100, 23);
		btEdit.setBounds(362, 509, 100, 23);
		btHomeEdit.setBounds(620, 34, 89, 60);

		// adicionando os botões "Confirma" e "Home"
		painelEdit.add(btPesquisa);
		painelEdit.add(btEdit);
		painelEdit.add(btHomeEdit);

		// tratamento dos botões
		btPesquisa.addActionListener(this);
		btEdit.addActionListener(this);
		btHomeEdit.addActionListener(this);
	}

	public void carroToBoundary(Carro car) {

		cadCarro.setText(car.getNomeCarro());
		cadMarca.setText(car.getMarca());
		cadModelo.setText(car.getModelo());
		cadAno.setText(Integer.toString(car.getAno()));
		cadCor.setText(car.getCor());
		cadPreco.setText(Float.toString(car.getPreco()));
	}

	public Carro boundaryToCarro() {

		try {
			car.setNomeCarro(cadCarro.getText());
			car.setMarca(cadMarca.getText());
			car.setModelo(cadModelo.getText());
			car.setAno(Integer.parseInt(cadAno.getText()));
			car.setCor(cadCor.getText());
			car.setPreco(Float.parseFloat(cadPreco.getText()));

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return car;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btHome) {
			addCar.dispose();
			new Janela();
		}
		if (e.getSource() == btHomeEdit) {
			addCar.dispose();
			new Janela();
		}
		if (e.getSource() == btConfirma) {

			Carro car = new Carro();
			car = boundaryToCarro();
			try {
				carCont.inserirCarro(car);
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			cadCarro.setText(null);
			cadMarca.setText(null);
			cadModelo.setText(null);
			cadAno.setText(null);
			cadCor.setText(null);
			cadPreco.setText(null);

		}
		if (e.getSource() == btPesquisa) {
		}
		if (e.getSource() == btEdit) {
		}
	}
}
