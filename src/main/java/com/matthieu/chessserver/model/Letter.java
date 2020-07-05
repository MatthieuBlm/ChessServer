package com.matthieu.chessserver.model;

public enum Letter {
	
	A('a', 8),
	B('b', 7),
	C('c', 6),
	D('d', 5),
	E('e', 4),
	F('f', 3),
	G('g', 2),
	H('h', 1),
	OUT('x', -1);
	
	private char c;
	private int i;
	
	
	Letter(char c, int i) {
		this.c = c;
		this.i = i;
	}
	
	public int getValue() {
		return this.i;
	}
	
	public static Letter valueOf(int i) {
		switch(i) {
		case 1 :
			return Letter.H;
		case 2 :
			return Letter.G;
		case 3 :
			return Letter.F;
		case 4 :
			return Letter.E;
		case 5 :
			return Letter.D;
		case 6 :
			return Letter.C;
		case 7 :
			return Letter.B;
		case 8 :
			return Letter.A;
			default :
				return Letter.OUT;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.c);
	}
}
