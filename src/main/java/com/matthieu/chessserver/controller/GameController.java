package com.matthieu.chessserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game")
public class GameController {

	@PostMapping("start")
	public ResponseEntity<?> startGame() {
		
		return ResponseEntity.ok().build();
	}
	
	
	@GetMapping("{gameId}")
	public ResponseEntity<?> getGame(@PathVariable Long gameId) {
		
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("{gameId}")
	public ResponseEntity<?> recieveCoordinates(@PathVariable Long gameId) {
		
		return ResponseEntity.ok().build();
	}
	
}
