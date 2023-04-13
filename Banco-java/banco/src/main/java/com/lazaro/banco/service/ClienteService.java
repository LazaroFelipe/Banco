package com.lazaro.banco.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaro.banco.entity.Cliente;
import com.lazaro.banco.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository ClienteRepository;
	
	@Autowired
	public ClienteService(ClienteRepository ClienteRepository) {
		this.ClienteRepository = ClienteRepository;
	}
	
	public Cliente CadastrarCliente(Cliente Cliente) {
		return this.ClienteRepository.save(Cliente);
	}
	
	public List<Cliente> RetornarTodosClientes(){
		return this.ClienteRepository.findAll();
	}
	
	public Cliente RetornaCliente(Long cpf) {
		return this.ClienteRepository.findById(cpf).get();
	}

	public ClienteSucesso DeletarCliente(Long cpf) {
		
		this.ClienteRepository.deleteById(cpf);
		ClienteSucesso mensagem = new ClienteSucesso();
		mensagem.setMensagem("Deletado com sucesso");
		return mensagem;
	}

	public Cliente AlterarCliente(Long cpf, @Valid Cliente cliente) {
		Cliente ClienteAlterado = this.ClienteRepository.findById(cpf).get();
		
		cliente.setCpf(cpf);
		
		return this.ClienteRepository.save(cliente);
	}
	
	

}
