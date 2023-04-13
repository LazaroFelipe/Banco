package com.lazaro.banco.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.lazaro.banco.entity.Emprestimo;
import com.lazaro.banco.repository.EmprestimoRepository;


@Service
public class EmprestimoService {
	
	private EmprestimoRepository EmprestimoRepository;
	
	
	@Autowired
	public EmprestimoService (EmprestimoRepository EmprestimoRepository) {
		this.EmprestimoRepository = EmprestimoRepository;
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Emprestimo CadastrarEmprestimo(Emprestimo Emprestimo) {
			return this.EmprestimoRepository.save(Emprestimo);
		
	}

	
	
	
	
	

}
