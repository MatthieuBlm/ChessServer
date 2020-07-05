package com.matthieu.chessserver.model.entity;

import javax.persistence.Entity;

@Entity
public class Move {
	
	private Coordinate from;
	
	private Coordinate to;
	
	public Move() {}

	public Move(Coordinate from, Coordinate to) {
		this.from = from;
		this.to = to;
	}

	public Coordinate getFrom() {
		return from;
	}

	public void setFrom(Coordinate from) {
		this.from = from;
	}

	public Coordinate getTo() {
		return to;
	}

	public void setTo(Coordinate to) {
		this.to = to;
	}
	
	@Override
	public String toString() {
		return "[" + this.from + ", " + this.to + "]";
	}
	
}
