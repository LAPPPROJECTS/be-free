package com.LAMPP.befree.registration.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreateProfileDTO {

    @NotBlank(message = "Please provide a name")
    @Size(min = 3)
    public String name;

    @NotBlank(message = "Please provide a surname")
    @Size(min = 3)
    public String surname;

    @NotBlank(message = "Email is required")
    @Email(message = "Email not valid")
    public String email;

    @NotBlank(message = "Please provide login details")
    @Size(min = 8, max = 20, message = "Your login must have between 8 and 20 characters")
    public String login;

    @NotBlank(message = "Please enter your password")
    @Size(min = 8, max = 15, message = "Your password must have between 8 and 15 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.!@#$%^&*])(?=\\S+$).{8,15}$")
    public String password;

    @NotBlank(message = "Phone number is required")
    @Size(min = 11, max = 11)
    public String phoneNumber;

    public int age;

}


