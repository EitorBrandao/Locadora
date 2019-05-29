
package control;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Usuario;

public class CadastroControl {

	List <Usuario> listaUsuario = new ArrayList<>();

	public void adicionar (Usuario user) {
	
		listaUsuario.add(user);
		System.out.println(listaUsuario.size());
		JOptionPane.showMessageDialog(null, user.getNome() +" " + user.getCpf() + " " + user.getEmail());
		
	}
	
	
	public Usuario pesquisarPorNome (String nome) { 
		
		
		for (Usuario user : listaUsuario){
			
			if(user.getNome().equals(nome)) {
				return user; 
			}
		}
		return null;
			
			
			
		}
	}

