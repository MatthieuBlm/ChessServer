package com.matthieu.chessserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matthieu.chessserver.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
