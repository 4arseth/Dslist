package com.project1.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.dslist.dto.GameMinDTO;
import com.project1.dslist.entities.Game;
import com.project1.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll() {
	
	  List<Game> result = gameRepository.findAll();
		return result;
		
	}
}
