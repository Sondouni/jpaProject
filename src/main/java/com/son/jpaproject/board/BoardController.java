package com.son.jpaproject.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.Objects;

@RestControllerAdvice
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    private final BoardEntityRepository boardEntityRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping
    public HashMap<String,Objects> getBoardList () {
        HashMap<String,Objects> resultMap = new HashMap<>();



        return resultMap;
    }

    @GetMapping("/{boardCd}")
    public BoardEntity getBoardDetail (@PathVariable String boardCd) {
        BoardEntity boardEntity = new BoardEntity();

        return boardEntity;
    }

    @PostMapping
    public BoardEntity insertBoard (@RequestBody HashMap<String, Objects> paramMap) {
        BoardEntity boardEntity = new BoardEntity();

        return boardEntity;
    }
}
