package com.matthieu.chessserver.model.entity;

import javax.persistence.Entity;

@Entity
public class Move {
	
	private Coordinate from;
	
	private Coordinate destination;
	
	public Move() {}

	public Move(Coordinate from, Coordinate destination) {
		this.from = from;
		this.destination = destination;
	}

	public Coordinate getFrom() {
		return from;
	}

	public void setFrom(Coordinate from) {
		this.from = from;
	}

	public Coordinate getDestination() {
		return destination;
	}

	public void setDestination(Coordinate destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "[" + this.from + ", " + this.destination + "]";
	}
	
}
