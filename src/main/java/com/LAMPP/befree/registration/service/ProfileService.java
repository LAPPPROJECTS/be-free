package com.LAMPP.befree.registration.service;

import com.LAMPP.befree.registration.dto.CreateProfileDTO;
import com.LAMPP.befree.registration.dto.GetProfileDTO;
import com.LAMPP.befree.registration.mapper.GetProfileToDTOMapper;
import com.LAMPP.befree.registration.model.Profile;
import com.LAMPP.befree.registration.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProfileService {

    ProfileRepository profileRepository;
    GetProfileToDTOMapper getProfileToDTOMapper;

    @Autowired
    public ProfileService(ProfileRepository profileRepository, GetProfileToDTOMapper getProfileToDTOMapper){
        this.profileRepository= profileRepository;
        this.getProfileToDTOMapper = getProfileToDTOMapper;
    }
    public List<GetProfileDTO>getAll(){
        List<Profile> profiles = profileRepository.getAll();
        return profiles.stream().map(profile -> getProfileToDTOMapper.getProfileDto(profile)).collect(Collectors.toList());
    }

    public GetProfileDTO getById(UUID idProfile){
        Profile profile = profileRepository.getById(idProfile);
        return getProfileToDTOMapper.getProfileDto(profile);
    }
    public GetProfileDTO getByLogin(String login){
        Profile profile= profileRepository.getByLogin(login);
        return getProfileToDTOMapper.getProfileDto(profile);
    }

    public void addProfile(CreateProfileDTO createProfileDTO){
        Profile profile= new Profile(createProfileDTO.name, createProfileDTO.surname, createProfileDTO.email, createProfileDTO.login, createProfileDTO.password,
                createProfileDTO.phoneNumber, createProfileDTO.age);
        profileRepository.addProfile(profile);
    }


}
