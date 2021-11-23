package com.jinju.Ramyun.service;

import com.jinju.Ramyun.model.BoardDTO;
import com.jinju.Ramyun.repository.BoardDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements MainService {

    @Autowired
    BoardDAO boardDAO;

    @Autowired
    SqlSessionTemplate sessionTemplate;

    @Override
    public List<BoardDTO> boardList() {
        return boardDAO.boardList(sessionTemplate);
    }
}
