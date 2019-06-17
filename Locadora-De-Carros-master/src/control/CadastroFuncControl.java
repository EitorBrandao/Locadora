package control;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.FuncionarioDAO;
import dao.IFuncionarioDAO;
import entities.Funcionario;


public class CadastroFuncControl {

	ArrayList<Funcionario> funcList = new ArrayList<Funcionario>(); 
		
	
	public void inserirFuncionario(Funcionario f) throws SQLException, ClassNotFoundException {
		IFuncionarioDAO fDao = new FuncionarioDAO();
		fDao.adicionarFunc(f);
	}

	public Funcionario pesquisarFunc (String id) {

		for (Funcionario func : funcList) {

			if (func.getNome().contains(id)) {
				
				return func;

			}

		}
		return null;
	}


}
