package com.son.jpaproject.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BoardEntityRepository extends JpaRepository<BoardEntity,String> {

    @Query(value = "select * from board", nativeQuery = true)
    List<BoardEntity> findAllBoard();
}
