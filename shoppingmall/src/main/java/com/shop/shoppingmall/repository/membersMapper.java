package com.shop.shoppingmall.repository;

import org.apache.ibatis.annotations.Mapper;
import com.shop.members.members;
import java.util.List;

@Mapper
public interface membersMapper {
    members selectByMemberNum(int memberNum);
    List<members> selectAllMembers(); // 전체 회원 조회 메서드 추가
}