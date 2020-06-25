package com.LAMPP.befree.dto;

import com.LAMPP.befree.model.ProfileType;

import java.util.Date;
import java.util.UUID;

public class GetProfileDTO {

    public Date dateCreateProfile;
    public UUID idProfile;
    public String name;
    public String surname;
    public String email;
    public String login;
    public long phoneNumber;
    public int age;
    public ProfileType profileType;

}
