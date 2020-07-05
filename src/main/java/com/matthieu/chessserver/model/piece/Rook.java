package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.Letter;
import com.matthieu.chessserver.model.entity.Coordinate;

public class Rook extends Piece {

	public Rook(Color color) {
		super(PieceType.ROOK, color);
	}

	@Override
	public List<Coordinate> getRangeFrom(Coordinate c, Board board) {
		List<Coordinate> possibleCoordinates = new ArrayList<>();
		
		// Right
		Coordinate tmpCoord = new Coordinate(Letter.valueOf(c.getLetter().getValue() - 1), c.getDigit());
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(Letter.valueOf(tmpCoord.getLetter().getValue() - 1), tmpCoord.getDigit());
		}
		
		// Left
		tmpCoord = new Coordinate(Letter.valueOf(c.getLetter().getValue() + 1), c.getDigit());
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(Letter.valueOf(tmpCoord.getLetter().getValue() + 1), tmpCoord.getDigit());
		}
		
		// Up
		tmpCoord = new Coordinate(c.getLetter(), c.getDigit() + 1);
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(c.getLetter(), c.getDigit() + 1);
		}
		
		// Down
		tmpCoord = new Coordinate(c.getLetter(), c.getDigit() - 1);
		while(!board.isOutOfBoard(tmpCoord) || board.getPiece(tmpCoord) == null) {
			possibleCoordinates.add(tmpCoord);
			
			tmpCoord = new Coordinate(c.getLetter(), c.getDigit() - 1);
		}
		
		return possibleCoordinates;
	}

}
