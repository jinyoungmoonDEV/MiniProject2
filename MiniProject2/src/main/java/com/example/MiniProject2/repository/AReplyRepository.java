package com.example.MiniProject2.repository;

import com.example.MiniProject2.entity.AReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AReplyRepository extends JpaRepository<AReply, Long> {
}
