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

@Entity  // define que a classe é uma entidade
@Table(name = "contatos") // Cria uma tabela com nome "postagem" dentro do banco de dados
public class Contatos {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    
    @Size(min = 0, max = 100)
    private String nomeC;
    
    @Size(min = 0, max = 100)
    private String numeroC;
    
    private int idade;
    
    private boolean planoSaude;
    
    
    private boolean comorbidade;
    
    
    private String cidade;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaLigacao = new java.sql.Date(System.currentTimeMillis());
    
    private int qtdLigacao;
    
    @NotNull
    private boolean venda;
    
    @NotNull
    private boolean atendido;
    
    @ManyToOne
	@JsonIgnoreProperties("contatos")
    private Usuario usuario;

    
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nomeC;
	}

	public void setNome(String nomeC) {
		this.nomeC = nomeC;
	}


	public Date getDate() {
		return ultimaLigacao;
	}

	public void setDate(Date date) {
		this.ultimaLigacao = date;
	}
	


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getQtdLigacao() {
		return qtdLigacao;
	}

	public void setQtdLigacao(int qtdLigacao) {
		this.qtdLigacao = qtdLigacao;
	}

	public boolean isVenda() {
		return venda;
	}

	public void setVenda(boolean venda) {
		this.venda = venda;
	}

	public boolean isAtendido() {
		return atendido;
	}

	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}

	public String getNumero() {
		return numeroC;
	}

	public void setNumero(String numero) {
		this.numeroC = numero;
	}

	public String getNomeC() {
		return nomeC;
	}

	public void setNomeC(String nomeC) {
		this.nomeC = nomeC;
	}

	public String getNumeroC() {
		return numeroC;
	}

	public void setNumeroC(String numeroC) {
		this.numeroC = numeroC;
	}

	public boolean isPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(boolean planoSaude) {
		this.planoSaude = planoSaude;
	}

	public Date getUltimaLigacao() {
		return ultimaLigacao;
	}

	public void setUltimaLigacao(Date ultimaLigacao) {
		this.ultimaLigacao = ultimaLigacao;
	}

	public boolean isComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(boolean comorbidade) {
		this.comorbidade = comorbidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	} 

    
	
    
    
    
}