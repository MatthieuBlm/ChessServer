package com.matthieu.chessserver.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.matthieu.chessserver.model.entity.Coordinates;
import com.matthieu.chessserver.model.piece.Bishop;
import com.matthieu.chessserver.model.piece.King;
import com.matthieu.chessserver.model.piece.Knight;
import com.matthieu.chessserver.model.piece.Pawn;
import com.matthieu.chessserver.model.piece.Piece;
import com.matthieu.chessserver.model.piece.Queen;
import com.matthieu.chessserver.model.piece.Rook;

public class Board {
	
	public static final int BOARD_SIZE = 8;
	
	private List<Piece> whitePieces = new ArrayList<>();
	
	private List<Piece> blackPieces = new ArrayList<>();

	private Cell[][] board;
	
	public Board() {
		
		this.board = new Cell[BOARD_SIZE][BOARD_SIZE];
		
		// White
		this.addPiece(new Coordinates(Letter.A, 1), new Rook(Color.WHITE));
		this.addPiece(new Coordinates(Letter.B, 1), new Knight(Color.WHITE));
		this.addPiece(new Coordinates(Letter.C, 1), new Bishop(Color.WHITE));
		this.addPiece(new Coordinates(Letter.D, 1), new Queen(Color.WHITE));
		this.addPiece(new Coordinates(Letter.E, 1), new King(Color.WHITE));
		this.addPiece(new Coordinates(Letter.F, 1), new Bishop(Color.WHITE));
		this.addPiece(new Coordinates(Letter.G, 1), new Knight(Color.WHITE));
		this.addPiece(new Coordinates(Letter.H, 1), new Rook(Color.WHITE));
		
		this.addPiece(new Coordinates(Letter.A, 2), new Pawn(Color.WHITE));
		this.addPiece(new Coordinates(Letter.B, 2), new Pawn(Color.WHITE));
		this.addPiece(new Coordinates(Letter.C, 2), new Pawn(Color.WHITE));
		this.addPiece(new Coordinates(Letter.D, 2), new Pawn(Color.WHITE));
		this.addPiece(new Coordinates(Letter.E, 2), new Pawn(Color.WHITE));
		this.addPiece(new Coordinates(Letter.F, 2), new Pawn(Color.WHITE));
		this.addPiece(new Coordinates(Letter.G, 2), new Pawn(Color.WHITE));
		this.addPiece(new Coordinates(Letter.H, 2), new Pawn(Color.WHITE));
		
		// Black
		this.addPiece(new Coordinates(Letter.A, 8), new Rook(Color.BLACK));
		this.addPiece(new Coordinates(Letter.B, 8), new Knight(Color.BLACK));
		this.addPiece(new Coordinates(Letter.C, 8), new Bishop(Color.BLACK));
		this.addPiece(new Coordinates(Letter.D, 8), new Queen(Color.BLACK));
		this.addPiece(new Coordinates(Letter.E, 8), new King(Color.BLACK));
		this.addPiece(new Coordinates(Letter.F, 8), new Bishop(Color.BLACK));
		this.addPiece(new Coordinates(Letter.G, 8), new Knight(Color.BLACK));
		this.addPiece(new Coordinates(Letter.H, 8), new Rook(Color.BLACK));
		
		this.addPiece(new Coordinates(Letter.A, 7), new Pawn(Color.BLACK));
		this.addPiece(new Coordinates(Letter.B, 7), new Pawn(Color.BLACK));
		this.addPiece(new Coordinates(Letter.C, 7), new Pawn(Color.BLACK));
		this.addPiece(new Coordinates(Letter.D, 7), new Pawn(Color.BLACK));
		this.addPiece(new Coordinates(Letter.E, 7), new Pawn(Color.BLACK));
		this.addPiece(new Coordinates(Letter.F, 7), new Pawn(Color.BLACK));
		this.addPiece(new Coordinates(Letter.G, 7), new Pawn(Color.BLACK));
		this.addPiece(new Coordinates(Letter.H, 7), new Pawn(Color.BLACK));
	}
	
	private void addPiece(Coordinates c, Piece piece) {
		this.setPiece(c, piece);
		if(piece.getColor() == Color.WHITE) {
			this.whitePieces.add(piece);
		} else {
			this.blackPieces.add(piece);
		}
	}
	
	public void setPiece(Coordinates c, Piece piece) {
		this.board[c.getLetter().getValue() - 1][c.getDigit() - 1].setPiece(piece);
		piece.setCoordinates(c);
	}
	
	public void removePiece(Coordinates c) {
		Cell cell = this.board[c.getLetter().getValue() - 1][c.getDigit() - 1];
		Piece piece = cell.getPiece();
		cell.setPiece(null);
		this.getPieces(piece.getColor()).remove(piece);
	}

	public Optional<Piece> getPiece(Coordinates c) {
		if(c.getDigit() > 8 || c.getDigit() < 1) {
			return Optional.ofNullable(null);
		} else if(c.getLetter() == Letter.OUT) {
			return Optional.ofNullable(null);
		}
			
		return Optional.ofNullable(this.board[c.getLetter().getValue()][c.getDigit()].getPiece());
	}
	
	public boolean isOutOfBoard(Coordinates c) {
		return c.getDigit() < 1 || c.getDigit() > 8 || c.getLetter() == Letter.OUT;
	}
	
	public List<Piece> getPieces(Color color) {
		if(color == Color.WHITE) {
			return this.whitePieces;
		}
		return this.blackPieces;
	}

}
