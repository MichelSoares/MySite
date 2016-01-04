package br.com.myplace.MB;

import javax.faces.bean.ManagedBean;

import br.com.myplace.entidades.Usuario;

@ManagedBean(name="usuarioMB")
public class UsuarioMB {
	
	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
