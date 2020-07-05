package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import com.matthieu.chessserver.model.Vector;

public class Pawn extends Piece {

	public Pawn(Color color) {
		super(PieceType.PAWN, color);
	}

	@Override
	protected List<Vector> getRange() {
		List<Vector> range = new LinkedList<>();
		
		int rangeSize = 1;
		
		// If it's the first time this pawn move,
		// its range is 2
		if(!this.hasMovedOnce()) {
			rangeSize = 2;
		}
		
		if(this.getColor() == Color.BLACK) {
			range.add(new Vector(0, -1, rangeSize));
			
		} else if (this.getColor() == Color.WHITE) {
			range.add(new Vector(0, 1, rangeSize));
		}
		
		return range;
	}

	

}
