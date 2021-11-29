package com.jinju.Ramyun.main.dao;

import com.jinju.Ramyun.main.model.LoginDTO;
import com.jinju.Ramyun.main.model.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberMapper {

    int memberCreate (MemberDTO memberDTO);

    MemberDTO idCheck(String id);
    MemberDTO passCheck(String pass);
}
