package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.entity.Coordinate;

public abstract class Piece {

	private PieceType type;
	private Color color;
	
	public Piece(PieceType type, Color color) {
		this.type = type;
		this.color = color;
	}
	
	public abstract List<Coordinate> getRangeFrom(Coordinate c, Board board);
	
	public Color getColor() {
		return this.color;
	}
	
	public PieceType getPieceType() {
		return this.type;
	}
}
