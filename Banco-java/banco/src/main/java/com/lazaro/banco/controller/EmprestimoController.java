package com.lazaro.banco.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.lazaro.banco.entity.Emprestimo;
import com.lazaro.banco.service.EmprestimoService;


@RestController
@RequestMapping("/clientes/{cpf}/emprestimos")
public class EmprestimoController {

	public EmprestimoService EmprestimoService;
	
	
	
	@Autowired
	public EmprestimoController(EmprestimoService EmprestimoService) {
		this.EmprestimoService = EmprestimoService;
	}
	
	@PostMapping("/emprestimo")
	@ResponseStatus(HttpStatus.CREATED)
	public Emprestimo CadastrarEmprestimo(@PathVariable Long cpf, @Valid @RequestBody Emprestimo Emprestimo) {
		return this.EmprestimoService.CadastrarEmprestimo(Emprestimo);
	}
	
	
}
