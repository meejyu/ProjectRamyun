package com.jinju.Ramyun.service;

import com.jinju.Ramyun.dao.BoardMapper;
import com.jinju.Ramyun.model.RamyunRecipeDTO;
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

    public List<RamyunRecipeDTO> getBoardList() {
        return boardMapper.getBoardList();
    }

    public RamyunRecipeDTO getBoardDto(int id) {
        return boardMapper.getBoardDto(id);
    }

    public int createBoard (RamyunRecipeDTO ramyunRecipeDTO) {
        return boardMapper.createBoard(ramyunRecipeDTO);
    }

    public int updateBoard (RamyunRecipeDTO ramyunRecipeDTO) {
        return boardMapper.updateBoard(ramyunRecipeDTO);
    }

    public int deleteBoard (int id) {
        return boardMapper.deleteBoard(id);
    }

}
