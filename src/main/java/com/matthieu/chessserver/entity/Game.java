package com.matthieu.chessserver.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Game {

	private List<Move> moves;

	public List<Move> getMoves() {
		return moves;
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	
	
}
