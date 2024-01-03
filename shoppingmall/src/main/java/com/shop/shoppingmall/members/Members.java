package com.shop.shoppingmall.members;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Members {
    private int memberNum; // 여기서는 camelCase를 사용
    private String memberId;
    private String memberPass;
    private String memberName;
    private String memberJoindate;
    private String memberBirth;
    private String memberEmail;
    private String memberPhone;
}
