package dao;

import java.sql.SQLException;

import entities.Usuario;

public interface IUsuarioDAO {

	public void adicionaUsuario (Usuario u) throws SQLException;
	public Usuario pesquisaUsuario (Usuario u) throws SQLException;
	public void atualizaUsuario (Usuario u) throws SQLException;
	public void excluiUsuario (Usuario u) throws SQLException;
	
}
