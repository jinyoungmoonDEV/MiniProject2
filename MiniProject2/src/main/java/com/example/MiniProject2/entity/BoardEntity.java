package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bno;

    @Column(name = "r_code", length = 10, nullable = false)
    public String r_code;

    @Column(name = "user_id", length = 20, nullable = false)
    public String user_id;

    @Column(name = "title", length = 30, nullable = false)
    private String title;

    @Column(name = "contents",length = 10000, nullable = false)
    private String contents;

    @Column(name = "viewers", length = 10, nullable = false)
    private long viewers;

    @Column(name = "replycnt", length = 10, nullable = false)
    private long replycnt;

    @OneToMany
    @JoinColumn(name = "brno")
    private Set<BReplyEntity> bReplyEntitySet;
}
