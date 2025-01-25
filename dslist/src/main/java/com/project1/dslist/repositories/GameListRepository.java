package com.project1.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
