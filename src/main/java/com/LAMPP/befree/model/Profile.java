package com.LAMPP.befree.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
@JsonAutoDetect
@Data
public class Profile implements Serializable {

    private String name;
    private  String surname;
    private String email ;
    private String login;
    private String password;
    private long idProfile;


    public Profile(String name, String surname, String email, String login, String password, long idProfile) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
        this.idProfile = idProfile;
    }

    public Profile() {
    }


}
