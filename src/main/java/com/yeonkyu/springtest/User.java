package com.yeonkyu.springtest;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class User {

    @NotNull(message = "")
    private String email;

    @Min(value = 0, message = "")
    private Integer price;
}

