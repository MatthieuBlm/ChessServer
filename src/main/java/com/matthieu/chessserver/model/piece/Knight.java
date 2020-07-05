package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.List;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.entity.Coordinate;

public class Knight extends Piece {

	public Knight(Color color) {
		super(PieceType.KNIGHT, color);
	}

	@Override
	public List<Coordinate> getRangeFrom(Coordinate c, Board board) {
		// TODO Auto-generated method stub
		return null;
	}

}