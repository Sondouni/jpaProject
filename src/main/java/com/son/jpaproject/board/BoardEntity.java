package com.son.jpaproject.board;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BOARD")
@Data
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long boardCd;
    private String title;
    private String content;
    @CreationTimestamp
    private Date regDt;
    @UpdateTimestamp
    private Date updDt;
    @ColumnDefault("0") //default 0
    private int hit;
}
