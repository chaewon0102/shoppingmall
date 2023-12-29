package com.shop.members;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberNum; // 여기서는 camelCase를 사용

    private String memberId;
    private String memberPass;
    private String memberName;
    private String memberJoindate;
    private String memberBirth;
    private String memberEmail;
    private String memberPhone;
}
