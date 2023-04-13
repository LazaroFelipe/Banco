package com.lazaro.banco.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lazaro.banco.entity.Cliente;
import com.lazaro.banco.entity.Emprestimo;
import com.lazaro.banco.service.ClienteService;
import com.lazaro.banco.service.ClienteSucesso;
import com.lazaro.banco.service.EmprestimoService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	private ClienteService ClienteService;
	public EmprestimoService EmprestimoService;
	
	@Autowired
	public ClienteController(ClienteService ClienteService) {
		this.ClienteService = ClienteService;
	}
	
	public ClienteController(EmprestimoService EmprestimoService) {
		this.EmprestimoService = EmprestimoService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente CadastrarCliente(@Valid @RequestBody Cliente Cliente) {
		return this.ClienteService.CadastrarCliente(Cliente);
		
	}
	
	@GetMapping
	public List<Cliente> RetornarTodosCliente(){
		return this.ClienteService.RetornarTodosClientes();
	}
	
	@GetMapping("/{cpf}")
	public Cliente RetornarCliente(@PathVariable Long cpf) {
		return this.ClienteService.RetornaCliente(cpf);
	}
	
	@DeleteMapping("/{cpf}")
	public ClienteSucesso DeletarCliente(@PathVariable Long cpf) {
		return this.ClienteService.DeletarCliente(cpf);
		
	}
	
	@PutMapping("/{cpf}")
	public Cliente AlterarCliente(@PathVariable Long cpf, @Valid @RequestBody Cliente Cliente) {
		return this.ClienteService.AlterarCliente(cpf, Cliente);
	}
	
	
	@PostMapping("/{cpf}/emprestimo")
	@ResponseStatus(HttpStatus.CREATED)
	public Emprestimo CadastrarEmprestimo(@PathVariable Long cpf, @Valid @RequestBody Emprestimo Emprestimo) {
		return this.EmprestimoService.CadastrarEmprestimo(Emprestimo);
	}
	
	

}
