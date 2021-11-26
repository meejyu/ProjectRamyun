package com.jinju.Ramyun.service;

import com.jinju.Ramyun.dao.ReviewMapper;
import com.jinju.Ramyun.model.ReviewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    ReviewMapper reviewMapper;

    public ReviewService(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    public List<ReviewDTO> reviewList() {
        return reviewMapper.reviewList();
    }

//    public ReviewDTO reviewDTO(int id) {
//        return reviewMapper.reviewDTO(id);
//    }

    public int reviewCreate (ReviewDTO reviewDTO) {
        return reviewMapper.reviewCreate(reviewDTO);
    }

    public int reviewUpdate (ReviewDTO reviewDTO) {
        return reviewMapper.reviewUpdate(reviewDTO);
    }

    public int reviewDelete (int id) {
        return reviewMapper.reviewDelete(id);
    }


}
