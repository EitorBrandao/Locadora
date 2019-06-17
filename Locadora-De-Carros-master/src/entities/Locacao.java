package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {

	private SimpleDateFormat dataLocacao = new SimpleDateFormat("dd/MM/yyyy");
	private Usuario usuario;
	private Carro carro;

	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public SimpleDateFormat getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(SimpleDateFormat dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
}
