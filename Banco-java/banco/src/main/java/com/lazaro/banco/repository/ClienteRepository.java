package com.lazaro.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.banco.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
}
