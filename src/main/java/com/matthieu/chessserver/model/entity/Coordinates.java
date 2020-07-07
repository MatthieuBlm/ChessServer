package com.matthieu.chessserver.model.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.matthieu.chessserver.model.Letter;
import com.matthieu.chessserver.model.Vector;

@Entity
public class Coordinates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private Letter letter;
	
	private int digit;
	
	public Coordinates() {}
	
	public Coordinates(Letter letter, int digit) {
		this.letter = letter;
		this.digit = digit;
	}
	
	public Coordinates apply(Vector vector) {
		Coordinates newCoordinate = new Coordinates(Letter.valueOf(this.getLetter().getValue() + vector.getX()), this.getDigit() + vector.getY());
		
		vector.setCapacity(vector.getCapacity() - 1);
		
		return newCoordinate;
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
