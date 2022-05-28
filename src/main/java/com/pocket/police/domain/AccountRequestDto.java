package com.pocket.police.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Setter // Lombok이 getter, setter 자동 생성
@Getter
@Embeddable
@RequiredArgsConstructor // 꼭 필요한 요소(final) 자동 생성
//@NoArgsConstructor
public class AccountRequestDto {

    private String user_id;
    private String password;
    private String user_name;
    private java.sql.Date birth;
    private String address;
    private String phone_number;
    private int user_siren_code;

    public Account toEntity(){
        return Account.builder()
                .user_id(user_id)
                .password(password)
                .user_name(user_name)
                .birth(birth)
                .address(address)
                .phone_number(phone_number)
                .user_siren_code(user_siren_code)
                .build();
    }

    public String getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }
}
