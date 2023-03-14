package com.yeonkyu.springtest;

import com.yeonkyu.springtest.config.ValidationGroups;
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

    @NotBlank(message = "이메일을 입력해주세요", groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^[a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$",
            message = "이메일 형식이 아닙니다.",
            groups = ValidationGroups.PatternCheckGroup.class)
    private String email;
    @NotBlank(message = "암호를 입력해주세요", groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^.*(?=.{6,20})(?=.*[0-9])(?=.*[a-zA-Z]).*$",
            message = "최소 8 자, 하나 이상의 대문자, 하나의 소문자, 하나의 숫자 및 하나의 특수 문자가 포함된 암호여야 합니다.",
            groups = ValidationGroups.PatternCheckGroup.class)
    private String password;
    @NotBlank(message = "이름을 입력해주세요", groups = ValidationGroups.NotBlankGroup.class)
    private String username;
    @NotBlank(message = "전화번호를 입력해주세요", groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^\\d{3}-\\d{3,4}-\\d{4}$",
            message = "전화번호 형식이 아닙니다.",
            groups = ValidationGroups.PatternCheckGroup.class)
    private String phone_number;
    @NotBlank(message = "주소를 입력해주세요", groups = ValidationGroups.NotBlankGroup.class)
    private String address;

}