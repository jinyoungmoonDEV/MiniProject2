package com.example.MiniProject2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AdoptTbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class Adopt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Ano;

    @Column(name = "RegionID", length = 10, nullable = false)
    public String RegionID;

    @Column(name = "UserID", length = 20, nullable = false)
    public String UserID;

    @Column(name = "Title", length = 30, nullable = false)
    private String Title;

    @Column(name = "Contents",length = 10000, nullable = false)
    private String Contents;

    @Column(name = "Image",length = 10000)
    private Blob Image;

    @Column(name = "Viewers", length = 10)
    private long Viewers;

    @Column(name = "Replycnt")
    private long Replycnt;

    @OneToMany
    @JoinColumn(name = "Ano")
    private Set<AReply> aReplySet;
}
