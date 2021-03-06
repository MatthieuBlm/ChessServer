package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import com.matthieu.chessserver.model.Vector;

public class Knight extends Piece {
	
	public Knight(Color color) {
		super(PieceType.KNIGHT, color);
	}

	@Override
	protected List<Vector> getRange() {
		List<Vector> range = new LinkedList<>();
		
		range.add(new Vector(-2, -1, 1));
		range.add(new Vector(2, -1, 1));
		range.add(new Vector(-2, 1, 1));
		range.add(new Vector(2, 1, 1));

		range.add(new Vector(-1, -2, 1));
		range.add(new Vector(-1, 2, 1));
		range.add(new Vector(1, -2, 1));
		range.add(new Vector(1, 2, 1));
		
		return range;
	}


}
