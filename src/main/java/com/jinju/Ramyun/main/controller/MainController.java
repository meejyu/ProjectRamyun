package com.jinju.Ramyun.main.controller;

import com.jinju.Ramyun.main.model.LoginDTO;
import com.jinju.Ramyun.main.model.MemberDTO;
import com.jinju.Ramyun.main.service.MainService;
import com.jinju.Ramyun.main.service.MemberService;
import com.jinju.Ramyun.recipe.service.RecipeService;
import com.jinju.Ramyun.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    MainService mainService;

    @Autowired
    MemberService memberService;

    //회원가입
    @RequestMapping("/signIn")
    public String loginInput(MemberDTO memberDTO) {
        memberService.memberCreate(memberDTO);

        return "signIn";
    }
    
    @RequestMapping("/")
    public String selectAllBoard() {
//        List<RecipeDTO> list = mainService.getBoardList();
//        System.out.println("리스트 출력되나?"+list+"리스트 출력");
//        for(RecipeDTO data : list) {
//            System.out.println(data.toString());
//        }

        return "main";
    }

    //로그인
    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) {
        mainService.login(loginDTO);

        return "login 성공";
    }

    @RequestMapping("/signUp")
    public String signUp() {
//        List<RecipeDTO> list = mainService.getBoardList();
//        System.out.println("리스트 출력되나?"+list+"리스트 출력");
//        for(RecipeDTO data : list) {
//            System.out.println(data.toString());
//        }

        return "signIn";
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
