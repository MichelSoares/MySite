package br.com.myplace.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario_preferencias")
public class UsuarioPreferencias implements Serializable{

	private static final long serialVersionUID = 39759312436586044L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private boolean mobilidade;
	private boolean seguranca;
	private boolean audioVideo;
	private boolean games;
	private boolean redes;
	private boolean midia;
	private boolean negocios;
	private boolean design;
	private boolean computacaoNuvem;
	private boolean redesSocias;
	private boolean programacao;
	private boolean carreira;
	private boolean internet;

	public boolean isMobilidade() {
		return mobilidade;
	}

	public void setMobilidade(boolean mobilidade) {
		this.mobilidade = mobilidade;
	}

	public boolean isSeguranca() {
		return seguranca;
	}

	public void setSeguranca(boolean seguranca) {
		this.seguranca = seguranca;
	}

	public boolean isGames() {
		return games;
	}

	public void setGames(boolean games) {
		this.games = games;
	}

	public boolean isAudioVideo() {
		return audioVideo;
	}

	public void setAudioVideo(boolean audioVideo) {
		this.audioVideo = audioVideo;
	}

	public boolean isRedes() {
		return redes;
	}

	public void setRedes(boolean redes) {
		this.redes = redes;
	}

	public boolean isMidia() {
		return midia;
	}

	public void setMidia(boolean midia) {
		this.midia = midia;
	}

	public boolean isRedesSocias() {
		return redesSocias;
	}

	public void setRedesSocias(boolean redesSocias) {
		this.redesSocias = redesSocias;
	}

	public boolean isNegocios() {
		return negocios;
	}

	public void setNegocios(boolean negocios) {
		this.negocios = negocios;
	}

	public boolean isDesign() {
		return design;
	}

	public void setDesign(boolean design) {
		this.design = design;
	}

	public boolean isComputacaoNuvem() {
		return computacaoNuvem;
	}

	public void setComputacaoNuvem(boolean computacaoNuvem) {
		this.computacaoNuvem = computacaoNuvem;
	}

	public boolean isProgramacao() {
		return programacao;
	}

	public void setProgramacao(boolean programacao) {
		this.programacao = programacao;
	}

	public boolean isCarreira() {
		return carreira;
	}

	public void setCarreira(boolean carreira) {
		this.carreira = carreira;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

}
