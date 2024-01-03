package com.shop.shoppingmall.repository;


import org.apache.ibatis.annotations.Mapper;

import com.shop.shoppingmall.members.Members;


@Mapper
public interface MembersMapper {
    Members findByMemberId(String memberId);
}


