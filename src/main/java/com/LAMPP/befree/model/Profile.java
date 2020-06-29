package com.LAMPP.befree.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@JsonAutoDetect
@Getter

public class Profile implements Serializable {

    private Date dateCreateProfile;
    private UUID idProfile;
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private long phoneNumber;
    private int age;
    private ProfileType profileType;


    public Profile(String name, String surname,
                   String email, String login, String password,
                   long phoneNumber, int age) {

        this.dateCreateProfile = new Date();
        this.idProfile = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.profileType = ProfileType.USER;
    }


}
