package com.dio.santnader.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santnader.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository  extends JpaRepository<Movimentacao, Integer>{

}
