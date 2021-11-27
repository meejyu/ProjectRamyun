package com.jinju.Ramyun.controller;

import com.jinju.Ramyun.model.RecipeDTO;
import com.jinju.Ramyun.model.ReviewDTO;
import com.jinju.Ramyun.service.MainService;
import com.jinju.Ramyun.service.RecipeService;
import com.jinju.Ramyun.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    MainService mainService;

    @Autowired
    RecipeService recipeService;

    @Autowired
    ReviewService reviewService;

    @RequestMapping("/")
    public String selectAllBoard() {
//        List<RecipeDTO> list = mainService.getBoardList();
//        System.out.println("리스트 출력되나?"+list+"리스트 출력");
//        for(RecipeDTO data : list) {
//            System.out.println(data.toString());
//        }

        return "main";
    }

    //view를 보여주는 API
    @RequestMapping("ramyum/recipe")
    public String recipeView() {
//        List<RecipeDTO> list = mainService.getBoardList();
//        System.out.println("리스트 출력되나?"+list+"리스트 출력");
//        for(RecipeDTO data : list) {
//            System.out.println(data.toString());
//        }
        return "recipe";
    }

    //데이터를 보내주는 API
    @RequestMapping("ramyum/recipeBoard")
    @ResponseBody
    public ModelMap recipeSelect() {
        ModelMap modelMap = new ModelMap();
        List<RecipeDTO> selectList = recipeService.recipeList();

        for(RecipeDTO data : selectList) {
            System.out.println("레시피 데이터 확인");
            System.out.println(data.toString());
        }
        modelMap.put("list",selectList);
        return modelMap;
    }

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
//
//    @RequestMapping("ramyum")
//    public String create() {
//        List<ReviewDTO> selectList = reviewService.reviewList();
//        for(ReviewDTO data : selectList) {
//            System.out.println("리뷰 데이터 확인");
//            System.out.println(data.toString());
//        }
//        return "review";
//    }

//    @RequestMapping("/update")
//    public String update() {
//        RecipeDTO dto = new RecipeDTO();
////        dto.setId(1);
////        dto.setName("조용히해");
////        mainService.updateBoard(dto);
////        System.out.println("아이디로 찾은 내용 출력하기");
////        System.out.println(dto.toString());
//        return "index";
//    }

//    @RequestMapping("/delete")
//    public String delete() {
//        mainService.deleteBoard(2);
//        System.out.println("아이디로 찾은 내용 출력하기");
//        try {
//            RecipeDTO recipeDTO = mainService.getBoardDto(2);
//        }
//        catch (Exception e) {
//            System.out.println("널값 잘 잡았다"+e.toString());
//        }
//        return "index";
//    }



}
