package com.matthieu.chessserver.model;

public enum Letter {
	
	A('a', 7),
	B('b', 6),
	C('c', 5),
	D('d', 4),
	E('e', 3),
	F('f', 2),
	G('g', 1),
	H('h', 0);
	
	private char c;
	private int i;
	
	
	Letter(char c, int i) {
		this.c = c;
		this.i = i;
	}
	
	public int getValue() {
		return this.i;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.c);
	}
}
