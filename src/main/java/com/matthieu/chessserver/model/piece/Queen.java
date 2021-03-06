package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.Vector;

public class Queen extends Piece {

	public Queen(Color color) {
		super(PieceType.QUEEN, color);
	}

	@Override
	protected List<Vector> getRange() {
		
		List<Vector> range = new LinkedList<>();
		
		// Diagonals
		range.add(new Vector(-1, -1, Board.BOARD_SIZE));
		range.add(new Vector(1, -1, Board.BOARD_SIZE));
		range.add(new Vector(-1, 1, Board.BOARD_SIZE));
		range.add(new Vector(1, 1, Board.BOARD_SIZE));

		// Lines
		range.add(new Vector(-1, 0, Board.BOARD_SIZE));
		range.add(new Vector(1, 0, Board.BOARD_SIZE));
		range.add(new Vector(0, -1, Board.BOARD_SIZE));
		range.add(new Vector(0, 1, Board.BOARD_SIZE));
		
		return range;
	}


}
