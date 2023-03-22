package com.son.jpaproject.board;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.Objects;

@RestControllerAdvice
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {


    private final BoardService boardService;

    @GetMapping
    public HashMap<String,Object> getBoardList () {
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("data",boardService.getBoardList());


        return resultMap;
    }

    @GetMapping("/list")
    public HashMap<String,Object> getBoardListEntityManager () {
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("data",boardService.getBoardListEntityManager());


        return resultMap;
    }

    @GetMapping("/{boardCd}")
    public BoardEntity getBoardDetail (@PathVariable String boardCd) {
        BoardEntity boardEntity = new BoardEntity();

        return boardEntity;
    }

    @PostMapping
    public HashMap<String,Object> insertBoard (@RequestBody BoardEntity boardEntity) {
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("data",boardService.insertBoard(boardEntity));
        return resultMap;
    }

    @PutMapping
    public HashMap<String,Object> updateBoard (@RequestBody BoardEntity boardEntity) {
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("data",boardService.updateBoard(boardEntity));
        return resultMap;
    }

    @DeleteMapping
    public HashMap<String,Object> deleteBoard (@RequestBody BoardEntity boardEntity) {
        System.out.println(boardEntity.toString());
        HashMap<String,Object> resultMap = new HashMap<>();
        resultMap.put("data",boardService.deleteBoard(boardEntity));
        return resultMap;
    }
}
