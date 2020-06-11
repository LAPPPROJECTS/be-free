package com.LAMPP.befree.mapper;

import com.LAMPP.befree.dto.ProfileDTO;
import com.LAMPP.befree.model.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileToDTOMapper {
    public ProfileDTO getProfileDto(Profile profile){
        if (profile == null){
            return null;
        }else {
            ProfileDTO profileDTO = new ProfileDTO();
            profileDTO.name= "DTO "+ profile.getName();
            profileDTO.surname= profile.getSurname();
            profileDTO.email= profile.getEmail() ;
            profileDTO.login= profile.getLogin();
            profileDTO.password= profile.getPassword();
            profileDTO.idProfile= profile.getIdProfile();
            profileDTO.age= profile.getAge();
            profileDTO.phoneNumber= profile.getPhoneNumber();
            profileDTO.profileType= profile.getProfileType();
            return profileDTO;
        }
    }
}
