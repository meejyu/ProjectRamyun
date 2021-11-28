package com.jinju.Ramyun.main.service;

import com.jinju.Ramyun.main.dao.MemberMapper;
import com.jinju.Ramyun.main.model.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    public int memberCreate (MemberDTO memberDTO) {
        
        
        return memberMapper.memberCreate(memberDTO);
    }

    //이메일 인증은 내일
    private void emailAuth (MemberDTO memberDTO) {
        
        memberDTO.getEmail();
    
    
    }

}
