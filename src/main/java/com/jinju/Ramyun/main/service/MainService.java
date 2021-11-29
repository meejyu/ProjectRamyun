package com.jinju.Ramyun.main.service;

import com.jinju.Ramyun.main.dao.MemberMapper;
import com.jinju.Ramyun.main.model.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    MemberMapper memberMapper;
    
    //회원 검증
    public String login(LoginDTO loginDTO) {

        if(null == memberMapper.idCheck(loginDTO.getId())) {
            return "아이디가 존재하지않습니다.";
        }
        if(memberMapper.passCheck(loginDTO.getPass()) == null) {
            return "비밀번호가 존재하지않습니다.";
        }
        return "로그인 성공";
    }
}
