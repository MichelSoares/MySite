package br.com.myplace.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 5229962052502555225L;

	@Id
	@SequenceGenerator(name = "SEG_USUARIO", sequenceName = "SEG_USUARIO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEG_USUARIO")
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_usuario_ocupacao", referencedColumnName="id")
	private UsuarioOcupacao usuarioOcupacao;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_usu_preferencias", referencedColumnName="id")
	private UsuarioPreferencias usuarioPreferencias;
	
	@Column (nullable = false)
	private String nome;
	
	@Column (nullable = false)
	private String sobreNome;
	
	@Column (nullable = false)
	private char sexo;
	
	@Temporal (TemporalType.DATE)
	@Column (name="dataNasc", nullable = false)
	private Date nascimento;
	
	@Column (nullable = false)
	private String grauEscolaridade;
	
	@Column (nullable = false)
	private String pais;
	
	@Column (nullable = false)
	private String email;
	
	@Column (nullable = false)
	private String senha;
	
	@Column (nullable = false)
	private String fraseLembraSenha;
	
	public Usuario(){
		
	}
	
	
	public Usuario(Long id, String nome, String sobreNome, char sexo, Date nascimento, String grauEscolaridade,
			String pais, String email, String senha, String fraseLembraSenha) {
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.grauEscolaridade = grauEscolaridade;
		this.pais = pais;
		this.email = email;
		this.senha = senha;
		this.fraseLembraSenha = fraseLembraSenha;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}
	public void setGrauEscolaridade(String grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFraseLembraSenha() {
		return fraseLembraSenha;
	}
	public void setFraseLembraSenha(String fraseLembraSenha) {
		this.fraseLembraSenha = fraseLembraSenha;
	}
	
}
