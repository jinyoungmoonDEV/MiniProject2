package com.example.MiniProject2.repository;

import com.example.MiniProject2.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
	List<Board> findByUserId(Long Bno);
}
