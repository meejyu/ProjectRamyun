package com.jinju.Ramyun.repository;

import com.jinju.Ramyun.model.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
public interface BoardDAO {

    public abstract List<BoardDTO> boardList(SqlSessionTemplate sessionTemplate);


}
