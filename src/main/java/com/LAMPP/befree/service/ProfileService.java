package com.LAMPP.befree.service;

import com.LAMPP.befree.dto.ProfileDTO;
import com.LAMPP.befree.mapper.ProfileToDTOMapper;
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
    ProfileToDTOMapper profileToDTOMapper;

    @Autowired
    public ProfileService(ProfileRepository profileRepository, ProfileToDTOMapper profileToDTOMapper){
        this.profileRepository= profileRepository;
        this.profileToDTOMapper= profileToDTOMapper;
    }
    public List<ProfileDTO>getAll(){
        List<Profile> profiles = profileRepository.getAll();
        return profiles.stream().map(profile -> profileToDTOMapper.getProfileDto(profile)).collect(Collectors.toList());
    }

    public ProfileDTO getById(UUID idProfile){
        Profile profile = profileRepository.getById(idProfile);
        return profileToDTOMapper.getProfileDto(profile);
    }
    public ProfileDTO getByLogin(String login){
        Profile profile= profileRepository.getByLogin(login);
        return profileToDTOMapper.getProfileDto(profile);
    }

    public void addProfile( ProfileDTO profileDTO){
        Profile profile= new Profile(profileDTO.idProfile, profileDTO.name, profileDTO.surname, profileDTO.email, profileDTO.login,
                profileDTO.password, profileDTO.phoneNumber, profileDTO.age, profileDTO.profileType );
        profileRepository.addProfile(profile);
    }

    }
