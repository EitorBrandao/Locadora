package boundaries;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class TelaAddCarro {

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
	private final JLabel lblAddCar = new JLabel("Cadastro de Ve\u00EDculo");

	public TelaAddCarro() {
		lblNomeCar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));

		painelCar.add(lblNomeCar);
		painelCar.add(lblMarca);
		painelCar.add(lblModel);
		painelCar.add(lblAno);
		painelCar.add(lblCor);
		painelCar.add(lblPreco);
		painelCar.add(txtPreco);

		painelCar.add(cmbMarca);
		painelCar.add(cmbCar);
		painelCar.add(cmbModel);
		painelCar.add(cmbAno);
		painelCar.add(cmbCor);

		lblNomeCar.setBounds(10, 212, 46, 14);
		lblMarca.setBounds(10, 152, 46, 14);
		lblModel.setBounds(10, 272, 46, 14);
		lblAno.setBounds(10, 332, 46, 14);
		lblCor.setBounds(10, 392, 46, 14);
		lblPreco.setBounds(10, 452, 46, 20);
		txtPreco.setBounds(326, 452, 86, 20);
		txtPreco.setColumns(10);

		cmbMarca.setBounds(384, 152, 28, 20);
		cmbCar.setBounds(384, 212, 28, 20);
		cmbModel.setBounds(384, 272, 28, 20);
		cmbAno.setBounds(384, 332, 28, 20);
		cmbCor.setBounds(384, 392, 28, 20);

		painelCar.setLayout(null);
		lblAddCar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddCar.setBounds(322, 11, 183, 60);

		painelCar.add(lblAddCar);

	}
}
