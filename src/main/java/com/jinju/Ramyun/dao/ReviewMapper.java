package com.jinju.Ramyun.dao;

import com.jinju.Ramyun.model.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReviewMapper {

//    ReviewDTO reviewDTO(int id);

    List<ReviewDTO> reviewList();

    int reviewCreate (ReviewDTO reviewDTO);
    int reviewUpdate (ReviewDTO reviewDTO);
    int reviewDelete (int id);

}
