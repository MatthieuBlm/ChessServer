package com.matthieu.chessserver.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Move {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Coordinates from;
	
	@OneToOne
	private Coordinates destination;
	
	public Move() {}

	public Move(Coordinates from, Coordinates destination) {
		this.from = from;
		this.destination = destination;
	}

	public Coordinates getFrom() {
		return from;
	}

	public void setFrom(Coordinates from) {
		this.from = from;
	}

	public Coordinates getDestination() {
		return destination;
	}

	public void setDestination(Coordinates destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "[" + this.from + ", " + this.destination + "]";
	}
	
}
