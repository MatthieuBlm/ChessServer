package com.matthieu.chessserver.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthieu.chessserver.entity.Game;
import com.matthieu.chessserver.entity.Move;
import com.matthieu.chessserver.exception.ForbiddenMoveException;
import com.matthieu.chessserver.repository.GameRepository;

@Service
public class GameService {

	private static final Logger logger = LoggerFactory.getLogger(GameService.class);

	@Autowired
	private GameRepository gameRepository;
	
	
	public String startNewGame() {
		Game newGame = new Game();
		
		newGame = this.gameRepository.save(newGame);
		
		logger.info("Nesw game created with id {}", newGame.getPublicId());
				
		return newGame.getPublicId();
	}

	public Game getGame(String gameId) {
		Optional<Game> optional = this.gameRepository.findByPublicId(gameId);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		
		throw new IllegalArgumentException("Unable to find game with id " + gameId);
	}
	
	public void performMove(String gameId, Move move) throws ForbiddenMoveException {
		// TODO
	}
	
	public boolean isValidMove(String gameId, Move move) {
		Game game = this.getGame(gameId);
		
		// TODO
		
		// Get Pawn
		
		// Get possible move of pawn
		
		// Verifiy if given move is in possible move
		
		return true;
	}
	
}
