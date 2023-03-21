package com.son.jpaproject.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardEntityRepository boardEntityRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public HashMap<String, Object> getBoardList (){
        HashMap<String,Object> resultMap = new HashMap<>();

        List<BoardEntity> boardEntityList = boardEntityRepository.findAllBoard();
//        List<BoardEntity> boardEntityList = boardEntityRepository.findAll();
        resultMap.put("list",boardEntityList);

        return resultMap;
    }

    public HashMap<String, Object> getBoardListEntityManager (){
        HashMap<String,Object> resultMap = new HashMap<>();
        List<BoardEntity> boardEntityList = entityManager.createQuery("select b from BoardEntity b",BoardEntity.class).getResultList();
        resultMap.put("list",boardEntityList);

        return resultMap;
    }

    @Transactional
    public HashMap<String, Object> insertBoard (BoardEntity paramMap){
        HashMap<String,Object> resultMap = new HashMap<>();
        entityManager.persist(paramMap);
        List<BoardEntity> boardEntityList = entityManager.createQuery("select b from BoardEntity b",BoardEntity.class).getResultList();
        resultMap.put("list",boardEntityList);

        return resultMap;
    }
}
