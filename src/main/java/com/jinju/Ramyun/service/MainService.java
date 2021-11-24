package com.jinju.Ramyun.service;

import com.jinju.Ramyun.dao.BoardMapper;
import com.jinju.Ramyun.model.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    BoardMapper boardMapper;

    public MainService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<BoardDTO> getBoardList() {
        return boardMapper.getBoardList();
    }

    public BoardDTO getBoardDto(int id) {
        return boardMapper.getBoardDto(id);
    }

    public int createBoard (BoardDTO boardDTO) {
        return boardMapper.createBoard(boardDTO);
    }

    public int updateBoard (BoardDTO boardDTO) {
        return boardMapper.updateBoard(boardDTO);
    }

    public int deleteBoard (int id) {
        return boardMapper.deleteBoard(id);
    }

}
