package com.yeonkyu.springtest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    @NotNull(message = "이메일을 입력해주세요")
    @Pattern(regexp = "/^[0-9a-zA-Z-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;", message = "이메일 형식이 아닙니다.")
    private String email;
    @NotNull(message = "암호를 입력해주세요")
    @Pattern(regexp = " /^.*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;", message = "특수문자 / 문자 / 숫자 포함 형태의 8~15자리 이내의 암호여야 합니다.")
    private String password;
    @NotNull(message = "이름을 입력해주세요")
    private String username;
    @NotNull(message = "전화번호를 입력해주세요")
    @Pattern(regexp = "/^\\d{3}-\\d{3,4}-\\d{4}$/;", message = "전화번호 형식이 아닙니다.")
    private String phone_number;
    @NotNull(message = "주소를 입력해주세요")
    private String address;

}