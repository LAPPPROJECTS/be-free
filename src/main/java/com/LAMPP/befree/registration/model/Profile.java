package com.LAMPP.befree.registration.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@JsonAutoDetect
@Getter
@Entity

public class Profile implements Serializable {

    @javax.persistence.Id
    @Id
    @org.hibernate.annotations.Type(type="org.hibernate.type.UUIDCharType")
    private UUID idProfile;

    private LocalDateTime dateCreateProfile;
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private String phoneNumber;
    private int age;
    private ProfileType profileType;


    public Profile(String name, String surname,
                   String email, String login, String password,
                   String phoneNumber, int age) {

        this.dateCreateProfile =  LocalDateTime.now();
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

    public Profile() {
    }
}
