package com.LAMPP.befree.model;

import com.LAMPP.befree.repository.ProfileRepository;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@JsonAutoDetect
@Data

public class Profile implements Serializable {
ProfileRepository profileRepository = new ProfileRepository();

    public UUID idProfile=profileRepository.insertProfile();
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private long phoneNumber;
    private int age;
    private ProfileType profileType;


    public Profile(UUID idProfile, String name, String surname,
                   String email,  String login,  String password,
                  long phoneNumber, int age, ProfileType profileType) {
        this.idProfile = idProfile;

        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.profileType = profileType;
    }


    public UUID getIdProfile() {
        return idProfile;
    }


}
