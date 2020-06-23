package com.LAMPP.befree.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

//@JsonAutoDetect
@Data

public class Profile implements Serializable {

    private final UUID idProfile;
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private long phoneNumber;
    private int age;
    private ProfileType profileType;


    public Profile(@JsonProperty("idProfile") UUID idProfile, String name, String surname,
                   String email, @JsonProperty("login") String login, String password,
                  long phoneNumber, int age, ProfileType profileType) {
        this.idProfile =idProfile;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.profileType= profileType;
    }

}
