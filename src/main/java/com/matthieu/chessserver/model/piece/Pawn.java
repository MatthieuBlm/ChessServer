package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.Letter;
import com.matthieu.chessserver.model.entity.Coordinate;

public class Pawn extends Piece {

	public Pawn(Color color) {
		super(PieceType.PAWN, color);
	}

	@Override
	public List<Coordinate> getRangeFrom(Coordinate c, Board board) {
		List<Coordinate> possibleCoordinate = new ArrayList<>();
		
		if(this.getColor() == Color.BLACK) {
			Coordinate front = new Coordinate(c.getLetter(), c.getDigit() - 1);
			
			if(board.getPiece(front) == null) {
				possibleCoordinate.add(front);
			}
			
			// Pawn didn't move
			if(c.getDigit() == 7) {
				Coordinate front2 = new Coordinate(c.getLetter(), c.getDigit() - 2);
				
				if(board.getPiece(front2) == null) {
					possibleCoordinate.add(front2);
				}
			}
			
			// Pawn can take a piece ?
			// Bottom right
			Coordinate maybePiece = new Coordinate(Letter.valueOf(c.getLetter().getValue() - 1), c.getDigit() - 1);
			if(board.getPiece(maybePiece) != null) {
				possibleCoordinate.add(maybePiece);
			}
			// Bottom left
			maybePiece = new Coordinate(Letter.valueOf(c.getLetter().getValue() + 1), c.getDigit() - 1);
			if(board.getPiece(maybePiece) != null) {
				possibleCoordinate.add(maybePiece);
			}
			
		} else if(this.getColor() == Color.WHITE) {
			Coordinate front = new Coordinate(c.getLetter(), c.getDigit() + 1);
			
			if(board.getPiece(front) == null) {
				possibleCoordinate.add(front);
			}
			
			// Pawn didn't move
			if(c.getDigit() == 2) {
				Coordinate front2 = new Coordinate(c.getLetter(), c.getDigit() + 2);
				
				if(board.getPiece(front2) == null) {
					possibleCoordinate.add(front2);
				}
			}
			
			// Pawn can take a piece ?
			// Top right
			Coordinate maybePiece = new Coordinate(Letter.valueOf(c.getLetter().getValue() - 1), c.getDigit() + 1);
			if(board.getPiece(maybePiece) != null) {
				possibleCoordinate.add(maybePiece);
			}
			// Top left
			maybePiece = new Coordinate(Letter.valueOf(c.getLetter().getValue() + 1), c.getDigit() + 1);
			if(board.getPiece(maybePiece) != null) {
				possibleCoordinate.add(maybePiece);
			}
		}
		
		return possibleCoordinate;
	}
	

}
