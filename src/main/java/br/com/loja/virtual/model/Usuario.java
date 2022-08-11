package br.com.loja.virtual.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cpfcnpj;
	private String nome;
	private LocalDate dataCriacao;
	private String telefone;
	private Perfil perfil;
	
	public Usuario() {}
	
	public Usuario(String cpfcnpj, String nome, LocalDate dataCriacao, String telefone, Perfil perfil) {
		this.cpfcnpj = cpfcnpj;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.telefone = telefone;
		this.perfil = perfil;
	}
	
	public String getCpfcnpj() {
		return cpfcnpj;
	}
	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Usuario [cpfcnpj=" + cpfcnpj + ", nome=" + nome + ", dataCriacao=" + dataCriacao + ", telefone="
				+ telefone + ", perfil=" + perfil + "]";
	}
	
}
