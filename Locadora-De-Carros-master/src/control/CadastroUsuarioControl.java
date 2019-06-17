package control;

import java.sql.SQLException;

import dao.IUsuarioDAO;
import dao.UsuarioDAO;
import entities.Funcionario;
import entities.Usuario;

public class CadastroUsuarioControl {

	public void cadastraUser(Usuario u) throws ClassNotFoundException, SQLException {
		IUsuarioDAO uDao = new UsuarioDAO();
		uDao.adicionaUsuario(u);
	}

	public Usuario pesquisarUser(Usuario u) throws ClassNotFoundException, SQLException {
		IUsuarioDAO uDao = new UsuarioDAO();
		uDao.pesquisaUsuario(u);

		return u;
	}

	public void atualizarUser(Usuario u) throws ClassNotFoundException, SQLException {
		IUsuarioDAO uDao = new UsuarioDAO();
		uDao.atualizaUsuario(u);
	}
}
