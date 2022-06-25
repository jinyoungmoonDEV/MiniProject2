package com.example.MiniProject2.repository;

import com.example.MiniProject2.entity.AdoptEntity;
import com.example.MiniProject2.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdoptRepository extends JpaRepository<AdoptEntity, String> {
    List<AdoptEntity> findByUserId(String ano);
}