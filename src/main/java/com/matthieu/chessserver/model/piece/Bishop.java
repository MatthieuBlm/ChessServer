package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.Letter;
import com.matthieu.chessserver.model.entity.Coordinate;

public class Bishop extends Piece {

	public Bishop(Color color) {
		super(PieceType.BISHOP, color);
	}

	@Override
	public List<Coordinate> getRangeFrom(Coordinate c, Board board) {
		List<Coordinate> possibleCoordinates = new ArrayList<>();
		
		// Top Right
		Coordinate tmpCoord = new Coordinate(Letter.valueOf(c.getLetter().getValue() - 1), c.getDigit() + 1);
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(Letter.valueOf(tmpCoord.getLetter().getValue() - 1), tmpCoord.getDigit() + 1);
		}
		
		// Top Left
		tmpCoord = new Coordinate(Letter.valueOf(c.getLetter().getValue() + 1), c.getDigit() + 1);
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(Letter.valueOf(tmpCoord.getLetter().getValue() + 1), tmpCoord.getDigit() + 1);
		}

		// Bottom Right
		tmpCoord = new Coordinate(Letter.valueOf(c.getLetter().getValue() - 1), c.getDigit() - 1);
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(Letter.valueOf(tmpCoord.getLetter().getValue() - 1), tmpCoord.getDigit() - 1);
		}
		
		// Bottom Left
		tmpCoord = new Coordinate(Letter.valueOf(c.getLetter().getValue() + 1), c.getDigit() - 1);
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(Letter.valueOf(tmpCoord.getLetter().getValue() + 1), tmpCoord.getDigit() - 1);
		}
		
		return possibleCoordinates;
	}

}
