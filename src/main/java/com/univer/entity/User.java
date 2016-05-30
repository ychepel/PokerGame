package com.univer.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.beans.Transient;

@Getter
@Setter
@ToString
public class User {

    @Size(min = 3, max = 20)
    private String inputPassword;

    private String password;

    @NotNull
    @Pattern(regexp=".+@.+\\.[a-z]+")
    private String email;

    @NotNull
    private String name;

    public User() {
    }
}
