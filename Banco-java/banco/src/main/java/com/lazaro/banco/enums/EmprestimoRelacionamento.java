package com.lazaro.banco.enums;


import java.math.BigDecimal;


public enum EmprestimoRelacionamento {
	
	
	Bronze{
		@Override
		public BigDecimal Calculavalorfinal(BigDecimal valorinicial) {
			
			return valorinicial.multiply(new BigDecimal("2.0"));
		}
			
	},
	
	Prata{

		@Override
		public
		BigDecimal Calculavalorfinal(BigDecimal valorinicial) {
			return valorinicial.multiply(new BigDecimal("3.00"));
			
		}
		
	},
	Ouro{
		
		@Override
		public
		BigDecimal Calculavalorfinal(BigDecimal valorinicial) {
			return valorinicial.multiply(new BigDecimal("4.00"));
			
		}
	};


	
	public abstract BigDecimal Calculavalorfinal(BigDecimal valorinicial);
	
	
	}


	