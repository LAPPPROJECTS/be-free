package com.LAMPP.befree.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

@JsonAutoDetect
@Data

public class Profile implements Serializable {

@Id
    public UUID idProfile;
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private long phoneNumber;
    private int age;
    private ProfileType profileType = ProfileType.USER;


    public Profile(UUID idProfile, String name, String surname,
                   String email, String login, String password,
                   long phoneNumber, int age, ProfileType USER) {
        this.idProfile =idProfile;
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
