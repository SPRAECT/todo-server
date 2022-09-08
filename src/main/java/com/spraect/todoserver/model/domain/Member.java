package com.spraect.todoserver.model.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Member {

    @Id
    @Column
    @NonNull
    @GeneratedValue(strategy= GenerationType.IDENTITY) //DB에 위임
    private Long id;

    @Column(unique = true)
    @NonNull
    private String email;

    @Column
    @NonNull
    private String password;

    @Column(name = "user_name")
    @NonNull
    private String userName;
}
