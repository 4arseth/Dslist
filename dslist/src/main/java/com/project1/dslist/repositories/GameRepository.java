package com.project1.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
