package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entities.Carro;

public class CarroDao implements iCarroDao {

	Connection con;

	public CarroDao() throws ClassNotFoundException, SQLException {
		IConnectionDAO cDao = new ConectionDAO();
		con = cDao.getConnection();
	}

	@Override
	public void inserirCarro(Carro c) {
		try {

			String sql = "INSERT INTO carro values(?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, c.getNomeCarro());
			stmt.setString(2, c.getMarca());
			stmt.setString(3, c.getModelo());
			stmt.setInt(4, c.getAno());
			stmt.setString(5, c.getCor());
			stmt.setFloat(6, c.getPreco());
			
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizarCarro(Carro c) {

	}

	@Override
	public void removerCarro(Carro c) {

	}

	@Override
	public Carro pesquisarCarroPorNome(Carro c) throws SQLException {
		try {

			String sql = "SELECT * from carro where nome_carro = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, c.getNomeCarro());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Carro pesquisarCarroPorMarca(Carro c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carro pesquisarCarroPorModelo(Carro c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carro pesquisarCarroPorAno(Carro c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Carro pesquisarCarroPorCor(Carro c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
