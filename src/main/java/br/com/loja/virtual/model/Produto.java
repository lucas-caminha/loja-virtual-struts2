package br.com.loja.virtual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nuProduto;
	private String nome;
	private String descricao;
	private Double valor;
	
	public Produto() {}
	
	public Produto(Integer nuProduto, String nome, String descricao, Double valor) {
		this.nuProduto = nuProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Integer getNuProduto() {
		return nuProduto;
	}
	public void setNuProduto(Integer nuProduto) {
		this.nuProduto = nuProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Produto [nuProduto=" + nuProduto + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor
				+ "]";
	}
}
