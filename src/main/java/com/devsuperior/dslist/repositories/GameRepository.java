package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;
//Repository objeto responsavel por fazer consultas ao banco de dados;

public interface GameRepository extends JpaRepository< Game, Long > {

}