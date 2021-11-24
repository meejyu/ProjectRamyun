package com.jinju.Ramyun.dao;

import com.jinju.Ramyun.model.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BoardMapper {

    BoardDTO getBoardDto(int id);

    List<BoardDTO> getBoardList();

    int createBoard (BoardDTO boardDTO);
    int updateBoard (BoardDTO boardDTO);
    int deleteBoard (int id);

}
