package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.Vector;

public class Bishop extends Piece {
	
	private List<Vector> range;

	public Bishop(Color color) {
		super(PieceType.BISHOP, color);
		
		this.range = new LinkedList<>();
		
		this.range.add(new Vector(-1, -1, Board.BOARD_SIZE));
		this.range.add(new Vector(1, -1, Board.BOARD_SIZE));
		this.range.add(new Vector(-1, 1, Board.BOARD_SIZE));
		this.range.add(new Vector(1, 1, Board.BOARD_SIZE));
	}
	
	@Override
	protected List<Vector> getRange() {
		return this.range;
	}

}
