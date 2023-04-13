package com.lazaro.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.banco.entity.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}
