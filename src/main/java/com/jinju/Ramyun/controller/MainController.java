package com.jinju.Ramyun.controller;

import com.jinju.Ramyun.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

//    MainService mainService;

    @RequestMapping({"/", "/index"})
    @ResponseBody
    public String index(){
//        String time = mainService.getTime();getTime
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("ramyunOne")
    public String name() {

        return "";
    }

}
