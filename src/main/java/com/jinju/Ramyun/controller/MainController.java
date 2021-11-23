package com.jinju.Ramyun.controller;

import com.jinju.Ramyun.model.BoardDTO;
import com.jinju.Ramyun.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@RequestMapping("/")
public class MainController {

    @Autowired
    MainService mainService;

//    @RequestMapping({"/", "/index"})
//    @ResponseBody
//    public String index(){
////        String time = mainService.getTime();getTime
//        System.out.println("hello");
//        return "hello";
//    }
//
//    @GetMapping("/ramyunOne")
//    public String name() {
//
//        return "";
//    }

    @RequestMapping("/")
    @ResponseBody
    public ModelAndView selectAllBoard() {
        ModelAndView modelAndView = new ModelAndView("test_db");
        List<BoardDTO> boardDTOList = mainService.boardList();
        modelAndView.addObject("list", boardDTOList);
        System.out.println("성공");
        System.out.println("모델엔뷰"+modelAndView+"모델엔뷰");
        return modelAndView;
    }

}
