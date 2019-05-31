package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import boundaries.TelaInicio;
import entities.Usuario;

public class UsuarioControl {

	ArrayList <Usuario> userList = new ArrayList<Usuario> ();
	
	public void CadastraUser (Usuario user) { 
	
		
	
		userList.add(user);
		System.out.println(userList.size() + user.getNome());

		
	}
	
	
	
	
}
