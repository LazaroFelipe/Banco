package com.lazaro.banco.entity;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.lazaro.banco.enums.EmprestimoRelacionamento;

@Entity
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal valorinicial;
	private Long CPFcliente;
	private BigDecimal valorfinal;
	private String Datainicial;
	private String Datafinal;
	private EmprestimoRelacionamento status;
	
	
	
	public Emprestimo(Long id, BigDecimal valorinicial, Long cPFcliente, BigDecimal valorfinal, String datainicial,
			String datafinal, EmprestimoRelacionamento status) {
		
		this.id = id;
		this.valorinicial = valorinicial;
		CPFcliente = cPFcliente;
		this.valorfinal = valorfinal;
		Datainicial = datainicial;
		Datafinal = datafinal;
		this.status = status;
	}
	
	

	public Emprestimo() {
		
	}

	
	public Long getCPFcliente() {
		return CPFcliente;
	}



	public Long setCPFcliente(Long CPFcliente) {
		return this.CPFcliente = CPFcliente;
	}

	public Emprestimo(EmprestimoRelacionamento statusinicial) {
		this.status = statusinicial;
		
	}
	
	public void SetStatusRelacionamento(EmprestimoRelacionamento novostatus) {
		this.status = novostatus;
	}
	
	public BigDecimal Valorfinalemprestimo(BigDecimal valorinicial) {
		valorfinal = this.status.Calculavalorfinal(valorinicial);
		return valorfinal;
		
	}



	public BigDecimal getValorinicial() {
		return valorinicial;
	}



	public void setValorinicial(BigDecimal valorinicial) {
		this.valorinicial = valorinicial;
	}



	public String getDatainicial() {
		return Datainicial;
	}



	public void setDatainicial(String datainicial) {
		Datainicial = datainicial;
	}



	public String getDatafinal() {
		return Datafinal;
	}



	public void setDatafinal(String datafinal) {
		Datafinal = datafinal;
	}



	public EmprestimoRelacionamento getStatus() {
		return status;
	}



	public void setStatus(EmprestimoRelacionamento status) {
		this.status = status;
	}



	public BigDecimal getValorfinal() {
		return valorfinal;
	}
	
	
	
}
