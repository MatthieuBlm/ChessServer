package com.matthieu.chessserver.model;

import java.awt.Color;
import java.util.Optional;

import com.matthieu.chessserver.model.entity.Coordinate;
import com.matthieu.chessserver.model.piece.Bishop;
import com.matthieu.chessserver.model.piece.King;
import com.matthieu.chessserver.model.piece.Knight;
import com.matthieu.chessserver.model.piece.Pawn;
import com.matthieu.chessserver.model.piece.Piece;
import com.matthieu.chessserver.model.piece.Queen;
import com.matthieu.chessserver.model.piece.Rook;

public class Board {

	Piece[][] board;
	
	public Board() {
		this.board = new Piece[8][8];
		
		// White
		this.setPiece(new Coordinate(Letter.A, 1), new Rook(Color.WHITE));
		this.setPiece(new Coordinate(Letter.B, 1), new Knight(Color.WHITE));
		this.setPiece(new Coordinate(Letter.C, 1), new Bishop(Color.WHITE));
		this.setPiece(new Coordinate(Letter.D, 1), new Queen(Color.WHITE));
		this.setPiece(new Coordinate(Letter.E, 1), new King(Color.WHITE));
		this.setPiece(new Coordinate(Letter.F, 1), new Bishop(Color.WHITE));
		this.setPiece(new Coordinate(Letter.G, 1), new Knight(Color.WHITE));
		this.setPiece(new Coordinate(Letter.H, 1), new Rook(Color.WHITE));
		
		this.setPiece(new Coordinate(Letter.A, 2), new Pawn(Color.WHITE));
		this.setPiece(new Coordinate(Letter.B, 2), new Pawn(Color.WHITE));
		this.setPiece(new Coordinate(Letter.C, 2), new Pawn(Color.WHITE));
		this.setPiece(new Coordinate(Letter.D, 2), new Pawn(Color.WHITE));
		this.setPiece(new Coordinate(Letter.E, 2), new Pawn(Color.WHITE));
		this.setPiece(new Coordinate(Letter.F, 2), new Pawn(Color.WHITE));
		this.setPiece(new Coordinate(Letter.G, 2), new Pawn(Color.WHITE));
		this.setPiece(new Coordinate(Letter.H, 2), new Pawn(Color.WHITE));
		
		// Black
		this.setPiece(new Coordinate(Letter.A, 8), new Rook(Color.BLACK));
		this.setPiece(new Coordinate(Letter.B, 8), new Knight(Color.BLACK));
		this.setPiece(new Coordinate(Letter.C, 8), new Bishop(Color.BLACK));
		this.setPiece(new Coordinate(Letter.D, 8), new Queen(Color.BLACK));
		this.setPiece(new Coordinate(Letter.E, 8), new King(Color.BLACK));
		this.setPiece(new Coordinate(Letter.F, 8), new Bishop(Color.BLACK));
		this.setPiece(new Coordinate(Letter.G, 8), new Knight(Color.BLACK));
		this.setPiece(new Coordinate(Letter.H, 8), new Rook(Color.BLACK));
		
		this.setPiece(new Coordinate(Letter.A, 7), new Pawn(Color.BLACK));
		this.setPiece(new Coordinate(Letter.B, 7), new Pawn(Color.BLACK));
		this.setPiece(new Coordinate(Letter.C, 7), new Pawn(Color.BLACK));
		this.setPiece(new Coordinate(Letter.D, 7), new Pawn(Color.BLACK));
		this.setPiece(new Coordinate(Letter.E, 7), new Pawn(Color.BLACK));
		this.setPiece(new Coordinate(Letter.F, 7), new Pawn(Color.BLACK));
		this.setPiece(new Coordinate(Letter.G, 7), new Pawn(Color.BLACK));
		this.setPiece(new Coordinate(Letter.H, 7), new Pawn(Color.BLACK));
	}
	
	public void setPiece(Coordinate c, Piece piece) {
		this.board[c.getLetter().getValue() - 1][c.getDigit() - 1] = piece;
	}
	
	public void removePiece(Coordinate c) {
		this.board[c.getLetter().getValue() - 1][c.getDigit() - 1] = null;
		
	}

	public Optional<Piece> getPiece(Coordinate c) {
		if(c.getDigit() > 8 || c.getDigit() < 1) {
			return Optional.ofNullable(null);
		} else if(c.getLetter() == Letter.OUT) {
			return Optional.ofNullable(null);
		}
			
		return Optional.ofNullable(this.board[c.getLetter().getValue()][c.getDigit()]);
	}
	
	public boolean isOutOfBoard(Coordinate c) {
		return c.getDigit() < 1 || c.getDigit() > 8 || c.getLetter() == Letter.OUT;
	}

}
