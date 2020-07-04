package com.matthieu.chessserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game/{gameId}")
public class GameController {

	@GetMapping
	public ResponseEntity<?> getGame(@PathVariable Long gameId) {
		
		return ResponseEntity.ok().build();
	}
	
	@PostMapping
	public ResponseEntity<?> recieveCoordinates(@PathVariable Long gameId) {
		
		return ResponseEntity.ok().build();
	}
	
}
