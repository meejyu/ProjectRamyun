package com.jinju.Ramyun.service;

import com.jinju.Ramyun.model.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {

    public abstract List<BoardDTO> boardList();

//    public String getTime(){
//
//        return "";
//    }
//
//    public String board() {
//
//        System.out.println("보드를 실행해야 합니다.");
//
//        return "board";
//    }

}
