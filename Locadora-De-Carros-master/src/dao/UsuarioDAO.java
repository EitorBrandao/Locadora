package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

	Connection con;

	public UsuarioDAO() throws ClassNotFoundException, SQLException {

		IConnectionDAO cDao = new ConectionDAO();
		con = cDao.getConnection();
	}

	
	public void adicionaUsuario(Usuario u) throws SQLException {

		try {
			String sql = "INSERT INTO tbl_user (nome, cpf, email, endereço, numero, telefone, senha) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, u.getNome());
			stmt.setString(2, u.getCpf());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getEndereco());
			stmt.setString(5, u.getCasaNum());
			stmt.setString(6, u.getTelefone());
			stmt.setString(7, u.getSenha());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public Usuario pesquisaUsuario (Usuario u) throws SQLException {
		
		
		String sql = ("SELECT * FROM tbl_user nome, cpf, email, endereço, numero, telefone, senha WHERE cpf = ?");
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, u.getCpf());
		
		ResultSet rs = stmt.executeQuery();
		
		if (rs.first()) {
			u.setNome (rs.getString("nome"));
			u.setCpf(rs.getString("cpf"));
			u.setEmail(rs.getString("email"));
			u.setEndereco(rs.getString("endereço"));
			u.setCasaNum(rs.getString("numero"));
			u.setTelefone(rs.getString("telefone"));
			u.setSenha(rs.getString("senha"));
			
		}
		rs.close();
		stmt.close();
		return u;
	}


	public void atualizaUsuario (Usuario u) throws SQLException {
		
		String sql = "UPDATE tbl_user SET nome = ?, cpf = ?, email = ?, endereço = ?, numero = ?, telefone = ?, senha = ? WHERE cpf = ? ";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, u.getNome());
		stmt.setString(2, u.getCpf());
		stmt.setString(3, u.getEmail());
		stmt.setString(4, u.getEndereco());
		stmt.setString(5, u.getCasaNum());
		stmt.setString(6, u.getTelefone());
		stmt.setString(7, u.getSenha());
		stmt.execute();
		stmt.close();
		
	}

	
	public void excluiUsuario(Usuario u) throws SQLException {
		String sql = "DELETE tbl_user WHERE cpf = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, u.getCpf());
		ps.execute();
		ps.close();

	}
}
