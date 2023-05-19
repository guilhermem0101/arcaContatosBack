package org.generation.blogPessoal.model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "vendas")
public class Vendas {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long idVenda;
	 
	 @NotNull
	 @Size(min = 0, max = 100)
	 private String nome;
	 
	 @Size(min = 0, max = 100)
	 private String numero;
	 
	 @Size(min = 0, max = 100)
	 private String email;
	 
	 @Size(min = 11, max = 12)
	 private String cpf;
	 
	 @NotNull
	 private Date dataNascimento;
	 
	 @NotNull
	 private double valor;
	 
	 private String formaPagamento;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 private Date horaVenda = new java.sql.Date(System.currentTimeMillis());
	 
	 @ManyToOne
	 @JsonIgnoreProperties("contatos")
	 private Usuario usuario;
	 
	 @ManyToOne
	 @JsonIgnoreProperties("contatos")
	 private Contatos contato;

	public long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getHoraVenda() {
		return horaVenda;
	}

	public void setHoraVenda(Date horaVenda) {
		this.horaVenda = horaVenda;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Contatos getContato() {
		return contato;
	}

	public void setContato(Contatos contato) {
		this.contato = contato;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	 
	 
	 
	 
}
