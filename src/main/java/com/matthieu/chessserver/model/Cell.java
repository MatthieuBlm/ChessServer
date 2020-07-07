package com.matthieu.chessserver.model;

import com.matthieu.chessserver.model.piece.Piece;

public class Cell {
	
	private Piece piece;
	
	public Piece getPiece() {
		return piece;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public boolean isEmpty() {
		return this.piece == null;
	}

}
