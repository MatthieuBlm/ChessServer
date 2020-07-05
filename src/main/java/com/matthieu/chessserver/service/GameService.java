package com.matthieu.chessserver.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthieu.chessserver.exception.ForbiddenMoveException;
import com.matthieu.chessserver.model.Board;
import com.matthieu.chessserver.model.entity.Coordinate;
import com.matthieu.chessserver.model.entity.Game;
import com.matthieu.chessserver.model.entity.Move;
import com.matthieu.chessserver.model.piece.Piece;
import com.matthieu.chessserver.repository.GameRepository;

@Service
public class GameService {

	private static final Logger logger = LoggerFactory.getLogger(GameService.class);

	@Autowired
	private GameRepository gameRepository;
	
	
	public String startNewGame() {
		Game newGame = new Game();
		
		newGame = this.gameRepository.save(newGame);
		
		logger.info("New game created with id {}", newGame.getPublicId());
				
		return newGame.getPublicId();
	}

	public Game getGame(String gameId) {
		Optional<Game> optional = this.gameRepository.findByPublicId(gameId);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		
		throw new IllegalArgumentException("Unable to find game with id " + gameId);
	}
	
	public void performMove(String gameId, Move move) throws ForbiddenMoveException {
		Game game = this.getGame(gameId);
		Board board = this.getBoard(game);
		
		if(this.isValidMove(board, move)) {
			game.addMove(move);
		} else {
			throw new ForbiddenMoveException(move);
		}
	}
	
	public boolean isValidMove(Board board, Move move) {
		
		Optional<Piece> piece = board.getPiece(move.getFrom());
		
		if(piece.isEmpty()) {
			return false;
		}
		
		Piece pieceToMove = piece.get();
		
		List<Coordinate> possibleCoord = pieceToMove.getRangeFrom(move.getFrom(), board);

		return possibleCoord.contains(move.getDestination());
	}
	
	public Board getBoard(Game game) {
		Board board = new Board();
		
		for (Move move : game.getMoves()) {
			this.applyMove(board, move);
		}
		
		return board;
	}
	
	private boolean applyMove(Board board, Move move) {
		Optional<Piece> piece = board.getPiece(move.getFrom());
		
		if(piece.isEmpty()) {
			return false;
		}
		
		board.removePiece(move.getFrom());
		board.setPiece(move.getDestination(), piece.get());
		
		return true;
	}
	
}
