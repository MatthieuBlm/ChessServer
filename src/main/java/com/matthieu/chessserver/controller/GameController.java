package com.matthieu.chessserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matthieu.chessserver.model.entity.Game;
import com.matthieu.chessserver.model.entity.Move;
import com.matthieu.chessserver.service.GameService;

@RestController
@RequestMapping("game")
public class GameController {

	@Autowired
	private GameService gameService;
	
	
	@PostMapping("start")
	public ResponseEntity<String> startGame() {
		return ResponseEntity.ok(this.gameService.startNewGame());
	}
	
	
	@GetMapping("{gameId}")
	public ResponseEntity<Game> getGame(@PathVariable String gameId) {
		return ResponseEntity.ok(this.gameService.getGame(gameId));
	}
	
	@PostMapping("{gameId}")
	public ResponseEntity<?> recieveMove(@PathVariable String gameId, @RequestBody Move move) {
		
		return ResponseEntity.ok().build();
	}
	
}
