package com.LAMPP.befree.service;

import com.LAMPP.befree.dto.GetProfileDTO;
import com.LAMPP.befree.mapper.GetProfileToDTOMapper;
import com.LAMPP.befree.model.Profile;
import com.LAMPP.befree.repository.ProfileRepository;
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

    public void addProfile( GetProfileDTO getProfileDTO){
        Profile profile= new Profile(getProfileDTO.name, getProfileDTO.surname, getProfileDTO.email, getProfileDTO.login,
                getProfileDTO.phoneNumber, getProfileDTO.age);
        profileRepository.addProfile(profile);
    }


}
