package br.com.myplace.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario_ocupacao")
public class UsuarioOcupacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String estudando;
	private String trabalhando;
	
	public String getEstudando() {
		return estudando;
	}
	public void setEstudando(String estudando) {
		this.estudando = estudando;
	}
	public String getTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(String trabalhando) {
		this.trabalhando = trabalhando;
	}
	

}
