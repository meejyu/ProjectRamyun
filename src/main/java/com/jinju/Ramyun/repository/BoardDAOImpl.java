package com.jinju.Ramyun.repository;

import com.jinju.Ramyun.model.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDATOImpl implements BoardDAO {

    @Override
    public List<BoardDTO> boardList(SqlSessionTemplate sessionTemplate) {
        return sessionTemplate.selectList("boardMapper.boardList");
    }

}
