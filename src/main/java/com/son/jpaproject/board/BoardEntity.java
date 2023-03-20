package com.son.jpaproject.board;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BOARD")
@Data
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardCd;
    private String title;
    private String content;
    private Date regDt;
    private int hit;
}
