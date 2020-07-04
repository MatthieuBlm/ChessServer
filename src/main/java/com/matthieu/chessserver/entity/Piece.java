package com.matthieu.chessserver.entity;

import java.awt.Color;

public class Piece {

	private PieceType type;
	private Color color;
	
	public Piece(PieceType type, Color color) {
		this.type = type;
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public PieceType getPieceType() {
		return this.type;
	}
}
