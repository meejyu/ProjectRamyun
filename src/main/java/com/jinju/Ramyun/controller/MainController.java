package com.jinju.Ramyun.controller;

import com.jinju.Ramyun.model.RamyunRecipeDTO;
import com.jinju.Ramyun.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/")
public class MainController {

    @Autowired
    MainService mainService;

    @RequestMapping("ramyum")
    public String selectAllBoard() {
//        List<RamyunRecipeDTO> list = mainService.getBoardList();
//        System.out.println("리스트 출력되나?"+list+"리스트 출력");
//        for(RamyunRecipeDTO data : list) {
//            System.out.println(data.toString());
//        }
        return "main";
    }

    @RequestMapping("ramyum/recipe")
    public String RecipeSelect() {
        List<RamyunRecipeDTO> selectList = mainService.getBoardList();
        for(RamyunRecipeDTO data : selectList) {
            System.out.println(data.toString());
        }
        return "index";
    }

    @RequestMapping("ramyum/postscript")
    public String create() {
        RamyunRecipeDTO dto = new RamyunRecipeDTO();
//        dto.setId(8);
//        dto.setAge(80);
//        dto.setName("지니땅");
//        dto.setHobby("게임보이");
        mainService.createBoard(dto);
        RamyunRecipeDTO ramyunRecipeDTO = mainService.getBoardDto(7);
        System.out.println("아이디로 찾은 내용 출력하기");
        System.out.println(ramyunRecipeDTO.toString());
        return "index";
    }

    @RequestMapping("/update")
    public String update() {
        RamyunRecipeDTO dto = new RamyunRecipeDTO();
//        dto.setId(1);
//        dto.setName("조용히해");
//        mainService.updateBoard(dto);
//        System.out.println("아이디로 찾은 내용 출력하기");
//        System.out.println(dto.toString());
        return "index";
    }

    @RequestMapping("/delete")
    public String delete() {
        mainService.deleteBoard(2);
        System.out.println("아이디로 찾은 내용 출력하기");
        try {
            RamyunRecipeDTO ramyunRecipeDTO = mainService.getBoardDto(2);
        }
        catch (Exception e) {
            System.out.println("널값 잘 잡았다"+e.toString());
        }
        return "index";
    }


}
