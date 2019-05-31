package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import boundaries.LoginUser;
import entities.Usuario;

public class UsuarioControl {

	ArrayList<Usuario> userList = new ArrayList<Usuario>();

	public void CadastraUser(Usuario user) {

		userList.add(user);
		System.out.println("Nome: " + user.getNome() + " CPF: " + user.getCpf() + " POSIÇÃO: " + userList.size());

	}

	public Usuario PesquisarUser(String nome) {

		for (Usuario user : userList) {

			if (user.getNome().contains(nome)) {
				return user;

			}

		}
		return null;
	}

}
