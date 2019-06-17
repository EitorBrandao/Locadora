package dao;

import java.sql.SQLException;

import entities.Funcionario;

public interface IFuncionarioDAO {

	public void adicionarFunc (Funcionario f) throws SQLException;
	public void excluiFunc (Funcionario f) throws SQLException;
	public Funcionario pesquisaFuncionario (Funcionario f) throws SQLException;
}
