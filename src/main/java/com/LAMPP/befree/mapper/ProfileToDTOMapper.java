package com.LAMPP.befree.mapper;

import com.LAMPP.befree.dto.ProfileDTO;
import com.LAMPP.befree.model.Profile;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.LAMPP.befree.model.ProfileType.USER;

@Service
public class ProfileToDTOMapper {
    public ProfileDTO getProfileDto(Profile profile) {
        if (profile == null) {
            return null;
        } else {

            ProfileDTO profileDTO = new ProfileDTO();
            profileDTO.dateCreateProfile = new Date();
            profileDTO.idProfile = profile.getIdProfile();
            profileDTO.name = profile.getName();
            profileDTO.surname = profile.getSurname();
            profileDTO.email = profile.getEmail();
            profileDTO.login = profile.getLogin();
            profileDTO.password = profile.getPassword();
            profileDTO.age = profile.getAge();
            profileDTO.phoneNumber = profile.getPhoneNumber();
            profileDTO.profileType = USER;
            return profileDTO;
        }
    }
}
