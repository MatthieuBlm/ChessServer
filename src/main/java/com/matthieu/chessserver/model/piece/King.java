package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import com.matthieu.chessserver.model.Vector;

public class King extends Piece {

	public King(Color color) {
		super(PieceType.KING, color);
	}

	@Override
	protected List<Vector> getRange() {
		List<Vector> range = new LinkedList<>();
		
		// Diagonals
		range.add(new Vector(-1, -1, 1));
		range.add(new Vector(1, -1, 1));
		range.add(new Vector(-1, 1, 1));
		range.add(new Vector(1, 1, 1));

		// Lines
		range.add(new Vector(-1, 0, 1));
		range.add(new Vector(1, 0, 1));
		range.add(new Vector(0, -1, 1));
		range.add(new Vector(0, 1, 1));
		
		return range;
	}


}
