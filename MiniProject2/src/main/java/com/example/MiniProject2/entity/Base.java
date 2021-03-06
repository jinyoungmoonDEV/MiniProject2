package com.example.MiniProject2.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract class Base {
    @CreatedDate
    @Column(name = "Regdate", updatable = false)
    private LocalDateTime RegDate;

    @LastModifiedDate
    @Column(name = "Moddate")
    private LocalDateTime ModDate;
}
