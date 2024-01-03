package com.shop.shoppingmall.members;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shop.shoppingmall.repository.MembersMapper;

@Service
public class MemberService {

    @Autowired
    private MembersMapper membersMapper;

    public Members login(String memberId, String memberPass) {
        // 아이디와 비밀번호로 회원 조회
        Members member = membersMapper.findByMemberId(memberId);
        if (member != null && member.getMemberPass().equals(memberPass)) {
            return member;
        }
        return null;
    }
}


