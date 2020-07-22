package com.LAMPP.befree.registration.mapper;

import com.LAMPP.befree.registration.dto.CreateProfileDTO;
import com.LAMPP.befree.registration.model.Profile;
import org.springframework.stereotype.Service;

@Service
public class CreateProfileToDTOMapper {

    public CreateProfileDTO createProfileDto(Profile profile) {
        if (profile == null) {
            return null;
        } else {


            CreateProfileDTO createProfileDto = new CreateProfileDTO();

            createProfileDto.name = profile.getName();
            createProfileDto.surname = profile.getSurname();
            createProfileDto.email = profile.getEmail();
            createProfileDto.login = profile.getLogin();
            createProfileDto.password = profile.getPassword();
            createProfileDto.age = profile.getAge();
            createProfileDto.phoneNumber = profile.getPhoneNumber();

            return createProfileDto;
        }
    }
}
