package com.jinju.Ramyun.review.controller;

import com.jinju.Ramyun.review.model.ReviewDTO;
import com.jinju.Ramyun.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class ReviewController {

    @Autowired
    ReviewService reviewService;


    //view를 보여주는 API
    @RequestMapping("ramyum/review")
    public String reviewView() {
        return "review";
    }

    //데이터를 보내주는 API
    @RequestMapping("ramyum/reviewBoard")
    @ResponseBody
    public ModelMap reviewSelect() {
        ModelMap modelMap = new ModelMap();
        List<ReviewDTO> selectList = reviewService.reviewList();

        for(ReviewDTO data : selectList) {
            System.out.println("리뷰 데이터 확인");
            System.out.println(data.toString());
        }
        modelMap.put("list",selectList);
        return modelMap;
    }

}
