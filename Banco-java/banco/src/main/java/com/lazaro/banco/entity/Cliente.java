package com.lazaro.banco.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	private Long cpf;
	
	private String nome;
	private String telefone;
	private String rua;
	private String numerocasa;
	private String cep;
	private BigDecimal rendamensal;
	

	public Cliente(Long cpf, String nome, String telefone, String rua, String numerocasa, String cep,
			BigDecimal rendamensal) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numerocasa = numerocasa;
		this.cep = cep;
		this.rendamensal = rendamensal;
	}
	
	

	public Cliente() {
		
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumerocasa() {
		return numerocasa;
	}

	public void setNumerocasa(String numerocasa) {
		this.numerocasa = numerocasa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public BigDecimal getRendamensal() {
		return rendamensal;
	}

	public void setRendamensal(BigDecimal rendamensal) {
		this.rendamensal = rendamensal;
	}
	
	

}
