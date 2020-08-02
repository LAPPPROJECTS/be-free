package com.LAMPP.befree.registration.dto;

import com.LAMPP.befree.registration.model.ProfileType;

import java.time.LocalDateTime;
import java.util.UUID;

public class GetProfileDTO {

    public LocalDateTime dateCreateProfile;
    public UUID idProfile;
    public String name;
    public String surname;
    public String email;
    public String login;
    public String phoneNumber;
    public int age;
    public ProfileType profileType;

}
