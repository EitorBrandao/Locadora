
package control;

import boundaries.TelaCadastro;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

import entities.Usuario;

public class CadastroControl {

	List <Usuario> listaUsuario = new ArrayList<>();
	
	public void adicionar (Usuario user) {
	
		listaUsuario.add(user);
		System.out.println(listaUsuario.size());
		JOptionPane.showMessageDialog(null, "Usuario '" + user.getNome() + "' salvo no sistema");
	}
	
	
	public void pesquisarPorNome(Usuario user) { 
		
		if (listaUsuario.contains(user.getNome())) {
		
			user.getCpf();
			user.getEmail();
			user.getEndereco();
			user.getTelefone();
			user.getSenha();
			
			
		}
	}

}