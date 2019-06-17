package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entities.Funcionario;

public class FuncionarioDAO implements IFuncionarioDAO {

	Connection con;

	public FuncionarioDAO() throws ClassNotFoundException, SQLException {
		IConnectionDAO cDao = new ConectionDAO();
		con = cDao.getConnection();
	}

	@Override
	public void adicionarFunc(Funcionario f) throws SQLException {

		try {
			String sql = "INSERT INTO tbl_func values (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, f.getNome());
			stmt.setInt(2, f.getId());
			stmt.setString(3, f.getSenha());
			stmt.executeUpdate();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void excluiFunc(Funcionario f) throws SQLException {
		
		
	}

	@Override
	public Funcionario pesquisaFuncionario(Funcionario f) throws SQLException {
		
		return null;
	}

}
