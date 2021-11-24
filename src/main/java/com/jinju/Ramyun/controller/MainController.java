package com.jinju.Ramyun.controller;

import com.jinju.Ramyun.model.BoardDTO;
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

    @RequestMapping("/")
    public String selectAllBoard() {
        List<BoardDTO> list = mainService.getBoardList();
        System.out.println("리스트 출력되나?"+list+"리스트 출력");
        for(BoardDTO data : list) {
            System.out.println(data.toString());
        }
        return "board";
    }

    @RequestMapping("/get")
    public String getBoard() {
        BoardDTO boardDTO = mainService.getBoardDto(1);
        System.out.println("아이디로 찾은 내용 출력하기");
        System.out.println(boardDTO.toString());
        return "index";
    }

    @RequestMapping("/create")
    public String create() {
        BoardDTO dto = new BoardDTO();
        dto.setId(8);
        dto.setAge(80);
        dto.setName("지니땅");
        dto.setHobby("게임보이");
        mainService.createBoard(dto);
        BoardDTO boardDTO = mainService.getBoardDto(7);
        System.out.println("아이디로 찾은 내용 출력하기");
        System.out.println(boardDTO.toString());
        return "index";
    }

    @RequestMapping("/update")
    public String update() {
        BoardDTO dto = new BoardDTO();
        dto.setId(1);
        dto.setName("조용히해");
        mainService.updateBoard(dto);
        System.out.println("아이디로 찾은 내용 출력하기");
        System.out.println(dto.toString());
        return "index";
    }

    @RequestMapping("/delete")
    public String delete() {
        mainService.deleteBoard(2);
        System.out.println("아이디로 찾은 내용 출력하기");
        try {
            BoardDTO boardDTO = mainService.getBoardDto(2);
        }
        catch (Exception e) {
            System.out.println("널값 잘 잡았다"+e.toString());
        }
        return "index";
    }


}
