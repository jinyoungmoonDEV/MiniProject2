package com.example.MiniProject2.repository;

import com.example.MiniProject2.entity.BReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BReplyRepository extends JpaRepository<BReply, Long> {
}
