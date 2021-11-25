package com.jinju.Ramyun.dao;

import com.jinju.Ramyun.model.RamyunRecipeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BoardMapper {

    RamyunRecipeDTO getBoardDto(int id);

    List<RamyunRecipeDTO> getBoardList();

    int createBoard (RamyunRecipeDTO ramyunRecipeDTO);
    int updateBoard (RamyunRecipeDTO ramyunRecipeDTO);
    int deleteBoard (int id);

}
