package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.Letter;
import com.matthieu.chessserver.model.entity.Coordinate;

public class King extends Piece {

	public King(Color color) {
		super(PieceType.KING, color);
	}

	@Override
	public List<Coordinate> getRangeFrom(Coordinate c, Board board) {
		List<Coordinate> possibleCoordinates = new ArrayList<>();
		
		for (int i = c.getLetter().getValue() - 1; i < c.getLetter().getValue() + 1; i++) {
			for (int j = c.getDigit() - 1; j < c.getDigit() + 1; j++) {
				Coordinate tmpCoord = new Coordinate(Letter.valueOf(i), j);
				
				if(!board.isOutOfBoard(tmpCoord)) {
					possibleCoordinates.add(tmpCoord);
				}
			}
		}
		
		return possibleCoordinates;
	}

}
