package com.matthieu.chessserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matthieu.chessserver.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	Optional<Game> findByPublicId(String publicId);
}
