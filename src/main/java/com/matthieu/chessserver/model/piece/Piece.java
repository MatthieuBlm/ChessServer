package com.matthieu.chessserver.model.piece;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.Vector;
import com.matthieu.chessserver.model.entity.Coordinates;

public abstract class Piece {

	private PieceType type;
	private final Color color;
	private boolean movedOnce;
	private Coordinates coordinates;
	
	public Piece(PieceType type, Color color) {
		this.type = type;
		this.color = color;
		this.movedOnce = false;
	}
	
	public Coordinates getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	protected abstract List<Vector> getRange();
	
	
	public List<Coordinates> getPossibleMove(Board board) {
		List<Coordinates> possibleCoordinates = new ArrayList<>();
		
		// For each range direction
		for (Vector vector : this.getRange()) {
			
			// While max range distance isn't reached
			while(vector.getCapacity() > 0) {
				Coordinates tmpCoord = this.coordinates.apply(vector);
				
				if(!board.isOutOfBoard(tmpCoord)) {
					
					// If it's a piece coordinate
					Optional<Piece> other = board.getPiece(tmpCoord);
					if(other.isPresent()) {
						
						// If it's an other color piece
						if(other.get().getColor() != this.getColor()) {
							// Can take it
							possibleCoordinates.add(tmpCoord);
						}
						
						// End of range calculation on this direction
						break;
						
					} else {
						// If no piece here, can move on it
						possibleCoordinates.add(tmpCoord);
					}
				}
			}
		}
		
		return possibleCoordinates;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public PieceType getPieceType() {
		return this.type;
	}
	
	public boolean hasMovedOnce() {
		return this.movedOnce;
	}
	
	public void setAsMovedOnce() {
		this.movedOnce = true;
	}
	
}
