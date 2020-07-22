package com.LAMPP.befree.registration.mapper;

import com.LAMPP.befree.registration.dto.GetProfileDTO;
import com.LAMPP.befree.registration.model.Profile;
import org.springframework.stereotype.Service;

@Service
public class GetProfileToDTOMapper {
    public GetProfileDTO getProfileDto(Profile profile) {
        if (profile == null) {
            return null;
        } else {


            GetProfileDTO getProfileDTO = new GetProfileDTO();

            getProfileDTO.dateCreateProfile =profile.getDateCreateProfile();
            getProfileDTO.idProfile =profile.getIdProfile();
            getProfileDTO.name = profile.getName();
            getProfileDTO.surname = profile.getSurname();
            getProfileDTO.email = profile.getEmail();
            getProfileDTO.login = profile.getLogin();
            getProfileDTO.age = profile.getAge();
            getProfileDTO.phoneNumber = profile.getPhoneNumber();
            getProfileDTO.profileType = profile.getProfileType();
            return getProfileDTO;
        }
    }
}
