package com.matthieu.chessserver.entity;

import javax.persistence.Entity;

@Entity
public class Coordinate {

	private Letter letter;
	private int digit;
	
	
	public Coordinate() {}
	
	public Coordinate(Letter letter, int digit) {
		this.letter = letter;
		this.digit = digit;
	}

	public Letter getLetter() {
		return letter;
	}

	public void setLetter(Letter letter) {
		this.letter = letter;
	}

	public int getDigit() {
		return digit;
	}

	public void setDigit(int digit) {
		this.digit = digit;
	}
	
	@Override
	public String toString() {
		return this.letter.toString() + "" + String.valueOf(this.digit);
	}
}
