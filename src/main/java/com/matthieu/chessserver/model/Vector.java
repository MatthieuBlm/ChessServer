package com.matthieu.chessserver.model;

public class Vector {
	
	private int x;
	
	private int y;
	
	private int capacity;
	
	public Vector(int x, int y, int capacity) {
		this.x = x;
		this.y = y;
		this.capacity = capacity;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
