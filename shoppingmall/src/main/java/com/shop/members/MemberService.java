package com.shop.members;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.shoppingmall.repository.membersMapper;

public class MemberService {
	
	@Autowired
	membersMapper membersMapper;
	
    // 전체 회원 조회 서비스 메서드 
    public List<members> getAllMembers() {
        return membersMapper.selectAllMembers();
    }
	

}
