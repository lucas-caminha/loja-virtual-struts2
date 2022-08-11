package br.com.loja.virtual.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nuPedido;
	private LocalDate dtEnvio;
	private StatusPedido statusPedido;
	@ManyToOne
	private Usuario usuario;
	
	public Pedido() {}
	
	public Pedido(Integer nuPedido, LocalDate dtEnvio, StatusPedido statusPedido, Usuario usuario) {
		this.nuPedido = nuPedido;
		this.dtEnvio = dtEnvio;
		this.statusPedido = statusPedido;
		this.usuario = usuario;
	}

	public Integer getNuPedido() {
		return nuPedido;
	}
	public void setNuPedido(Integer nuPedido) {
		this.nuPedido = nuPedido;
	}
	public LocalDate getDtEnvio() {
		return dtEnvio;
	}
	public void setDtEnvio(LocalDate dtEnvio) {
		this.dtEnvio = dtEnvio;
	}
	public StatusPedido getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Pedido [nuPedido=" + nuPedido + ", dtEnvio=" + dtEnvio + ", statusPedido=" + statusPedido + ", usuario="
				+ usuario + "]";
	}
	
}
