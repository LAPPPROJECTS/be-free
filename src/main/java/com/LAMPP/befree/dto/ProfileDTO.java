package com.LAMPP.befree.dto;

import com.LAMPP.befree.model.ProfileType;

import java.util.Date;
import java.util.UUID;

public class ProfileDTO {
    public Date dateCreateProfile;
    public UUID idProfile;
    public String name;
    public String surname;
    public String email;
    public String login;
    public String password;
    public long phoneNumber;
    public int age;
    public ProfileType profileType;
}
