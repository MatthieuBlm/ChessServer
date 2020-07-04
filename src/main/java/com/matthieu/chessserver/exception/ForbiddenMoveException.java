package com.matthieu.chessserver.exception;

import com.matthieu.chessserver.entity.Move;

public class ForbiddenMoveException extends Exception {

	private static final long serialVersionUID = -4783067344715486439L;
	
	private Move move;

	public ForbiddenMoveException(Move move) {
		this.move = move;
	}
	
	@Override
	public String toString() {
		return "This move is forbidden : " + move.toString();
	}
}
