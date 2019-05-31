package boundaries;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TelaAlugaCarro {
	
	JPanel painelAluga = new JPanel();
	
	JLabel lblMarca = new JLabel("Marca");
	JLabel lblCarro = new JLabel("Carro");
	JLabel lblModel = new JLabel("Modelo");
	JComboBox cmbMarca = new JComboBox();
	JComboBox cmbCarro = new JComboBox();
	JComboBox cmbModel = new JComboBox();
	JComboBox cmbAno = new JComboBox();
	JComboBox cmdCor = new JComboBox();
	JLabel lblPreco = new JLabel("Preço");
	JLabel lblCor = new JLabel("Cor");
	JLabel lblAno = new JLabel("Ano");
	JLabel lblValor = new JLabel("");
	private final JLabel lblAluguelDeCarros = new JLabel("Aluguel de Carros");
	
	public TelaAlugaCarro () {
		painelAluga.setLayout(null);
		
		
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(10, 157, 46, 14);
		painelAluga.add(lblMarca);
		painelAluga.add(lblCarro);
		painelAluga.add(lblModel);
		painelAluga.add(lblAno);
		painelAluga.add(lblCor);
		painelAluga.add(lblPreco);
		painelAluga.add(cmbMarca);
		painelAluga.add(cmbCarro);
		painelAluga.add(cmbModel);
		painelAluga.add(cmbAno);
		painelAluga.add(cmdCor);
		painelAluga.add(lblValor);
		
		lblCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarro.setBounds(10, 215, 46, 14);
		
		
		
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModel.setBounds(10, 276, 46, 14);
		
		
		
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAno.setBounds(10, 338, 46, 14);
		
		
		
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCor.setBounds(10, 402, 46, 14);
		
		
		
		lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreco.setBounds(10, 489, 46, 28);
		lblValor.setBounds(405, 498, 46, 14);
		
		
		cmbMarca.setBounds(362, 151, 89, 20);
		cmbCarro.setBounds(362, 214, 89, 20);
		cmbModel.setBounds(362, 275, 89, 20);
		cmbAno.setBounds(362, 332, 89, 20);
		cmdCor.setBounds(362, 401, 89, 20);
		lblAluguelDeCarros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAluguelDeCarros.setBounds(319, 11, 164, 28);
		
		painelAluga.add(lblAluguelDeCarros);
		
	
		
		
	}
}
