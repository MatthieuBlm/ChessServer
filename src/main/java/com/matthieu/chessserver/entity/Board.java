package com.matthieu.chessserver.entity;

import java.awt.Color;
import java.util.Optional;

public class Board {

	Piece[][] board;
	
	public Board() {
		this.board = new Piece[8][8];
		
		// White
		this.addPiece(new Coordinate(Letter.A, 1), new Piece(PieceType.ROOK, Color.WHITE));
		this.addPiece(new Coordinate(Letter.B, 1), new Piece(PieceType.KNIGHT, Color.WHITE));
		this.addPiece(new Coordinate(Letter.C, 1), new Piece(PieceType.BISHOP, Color.WHITE));
		this.addPiece(new Coordinate(Letter.D, 1), new Piece(PieceType.QUEEN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.E, 1), new Piece(PieceType.KING, Color.WHITE));
		this.addPiece(new Coordinate(Letter.F, 1), new Piece(PieceType.BISHOP, Color.WHITE));
		this.addPiece(new Coordinate(Letter.G, 1), new Piece(PieceType.KNIGHT, Color.WHITE));
		this.addPiece(new Coordinate(Letter.H, 1), new Piece(PieceType.ROOK, Color.WHITE));
		
		this.addPiece(new Coordinate(Letter.A, 2), new Piece(PieceType.PAWN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.B, 2), new Piece(PieceType.PAWN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.C, 2), new Piece(PieceType.PAWN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.D, 2), new Piece(PieceType.PAWN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.E, 2), new Piece(PieceType.PAWN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.F, 2), new Piece(PieceType.PAWN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.G, 2), new Piece(PieceType.PAWN, Color.WHITE));
		this.addPiece(new Coordinate(Letter.H, 2), new Piece(PieceType.PAWN, Color.WHITE));
		
		// Black
		this.addPiece(new Coordinate(Letter.A, 1), new Piece(PieceType.ROOK, Color.BLACK));
		this.addPiece(new Coordinate(Letter.B, 1), new Piece(PieceType.KNIGHT, Color.BLACK));
		this.addPiece(new Coordinate(Letter.C, 1), new Piece(PieceType.BISHOP, Color.BLACK));
		this.addPiece(new Coordinate(Letter.D, 1), new Piece(PieceType.QUEEN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.E, 1), new Piece(PieceType.KING, Color.BLACK));
		this.addPiece(new Coordinate(Letter.F, 1), new Piece(PieceType.BISHOP, Color.BLACK));
		this.addPiece(new Coordinate(Letter.G, 1), new Piece(PieceType.KNIGHT, Color.BLACK));
		this.addPiece(new Coordinate(Letter.H, 1), new Piece(PieceType.ROOK, Color.BLACK));
		
		this.addPiece(new Coordinate(Letter.A, 2), new Piece(PieceType.PAWN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.B, 2), new Piece(PieceType.PAWN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.C, 2), new Piece(PieceType.PAWN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.D, 2), new Piece(PieceType.PAWN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.E, 2), new Piece(PieceType.PAWN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.F, 2), new Piece(PieceType.PAWN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.G, 2), new Piece(PieceType.PAWN, Color.BLACK));
		this.addPiece(new Coordinate(Letter.H, 2), new Piece(PieceType.PAWN, Color.BLACK));
	}
	
	public void addPiece(Coordinate c, Piece piece) {
		this.board[c.getLetter().getValue() - 1][c.getDigit() - 1] = piece;
	}
	
	public Optional<Piece> getPiece(Coordinate c) {
		return Optional.of(this.board[c.getLetter().getValue()][c.getDigit()]);
	}
}
